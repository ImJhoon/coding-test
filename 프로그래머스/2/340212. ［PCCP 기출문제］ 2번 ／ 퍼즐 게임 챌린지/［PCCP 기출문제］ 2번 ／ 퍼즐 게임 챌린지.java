class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        // diffs : 풀 퍼즐의 레벨 배열 , times : 풀 퍼즐의 시간 배열, limit : 퍼즐을 풀 제한 시간
        // level : 현재 내 레벨
        // time_cur : 현재 퍼즐의 소요 시간 , time_prev : 이전 퍼즐의 소요 시간
        
        // [상황]
        // diff <= level 이면 퍼즐을 틀리지 않고 time_cur 만큼의 시간을 사용
        // diff > level 이면 퍼즐을 diff - level 번 틀림
        // 퍼즐을 틀릴 때마다 time_cur만큼의 시간을 사용 - > 이전 퍼즐을 다시 풀 때는 난이도에 상관없이 틀리지 않음
        // diff - level 번 틀린 이후에 다시 퍼즐을 풀면 time_cur 만큼의 시간을 사용하여 퍼즐 해결
        // 즉 (time_cur + time_prev) * (diff - level) + time_cur 
        
        // [목표]
        // limit 이내에서 퍼즐을 모두 해결하기 위한 숙련도의 최솟값을 구하라
        int answer = 0;
        int left = 1;
        int right = 100_000;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (canSolve(mid, diffs, times, limit)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return answer;
        
    }
    
    private boolean canSolve(int level, int[] diffs, int times[], long limit){
        long total = 0;   
            
        for (int i = 0; i < diffs.length; i++){ 
            int diff = diffs[i];
            int time_cur = times[i];

            if (diff <= level) {
                total += time_cur;
            } else {
                total += (time_cur + times[i - 1]) * (diff - level) + time_cur;
            }
        }
        return total <= limit;
    }
}
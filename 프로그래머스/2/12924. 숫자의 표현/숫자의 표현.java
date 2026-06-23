class Solution {
    public int solution(int n) {
        // 1 3 6 10 15 21 28 36 45 55 66 78 91 105
        int answer = 0;
        
        for (int i = 1; i <= n / 2; i++) {
            int plus = i;
            int sum = 0;
     
            while (sum <= n) {
                sum += plus;
                plus++;
                
                if (sum == n){
                    answer++;
                    break;
                }
            }
        }
        
        answer++;
        
        return answer;
    }
}
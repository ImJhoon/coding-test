import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        // 한 심사대에서는 한 명만 심사 가능
        // 비어 있는 심사대로 갈 수도 있지만 기다렸다 심사를 받을 때
        // 더 빨리 끝날 수 있는 심사대가 있으면 그곳으로 감
        // 입국 심사를 기다리는 사람 수 n, 각 심사관이 한 명을 심사하는데 걸리는 시간이 담긴 times
        Arrays.sort(times);

        long answer = 0;
        long left = 0;
        long right = times[times.length - 1] * (long)n;

        while (left <= right) {
            long mid = (left + right) / 2;
            long complete = 0;
            
            for (int i = 0; i < times.length; i++) {
                complete += mid / times[i];
            }
            
            if (complete < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
                answer = mid;
            }
        }
        
        return answer;
    }
}
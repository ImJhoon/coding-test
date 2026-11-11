import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr)
                .min().orElse(-1);
        
        int[] answer = Arrays.stream(arr)
                .filter(n -> n != min)
                .toArray();
        
        if (answer.length == 0) {
            return new int[]{-1};
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                numberSet.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[numberSet.size()];
        
        int index = 0;
        
        for (int i : numberSet) {
            answer[index++] = i;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
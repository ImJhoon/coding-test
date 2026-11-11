/*
1번 수포자 : 1,2,3,4,5 반복
2번 수포자 : (2,1),(2,3),(2,4),(2,5) 반복
3번 수포자 : 3,3,1,1,2,2,4,4,5,5 반복
*/
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        int[] supoza1 = {1,2,3,4,5};
        int[] supoza2 = {2,1,2,3,2,4,2,5};
        int[] supoza3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] correct = new int[3];
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < answers.length; i++) {
            int supoza1Tmp = i;
            int supoza2Tmp = i;
            int supoza3Tmp = i;
            
            if (i >= supoza1.length) {
                supoza1Tmp = i % supoza1.length;
            }
            
            if (i >= supoza2.length) {
                supoza2Tmp = i % supoza2.length;
            }
            
            if (i >= supoza3.length) {
                supoza3Tmp = i % supoza3.length;
            }
            
            if (supoza1[supoza1Tmp] == answers[i]) {
                correct[0]++;
            }
            
            if (supoza2[supoza2Tmp] == answers[i]) {
                correct[1]++;
            }
            
            if (supoza3[supoza3Tmp] == answers[i]) {
                correct[2]++;
            }
        }
        
        int[] correctSort = correct.clone();
        Arrays.sort(correctSort);
        
        int maxVal = correctSort[correctSort.length - 1];
        
        for (int i = 0; i < 3; i++) {
            if (correct[i] == maxVal) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}
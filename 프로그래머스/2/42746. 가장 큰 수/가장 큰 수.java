import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[]  strNumbers = new String[numbers.length];
        String answer = "";
        
        for (int i = 0; i < numbers.length; i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strNumbers, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
           
        for (String s : strNumbers){
            answer += s;
            }
        
        // 첫번째 수가 0일 경우에 모든 리스트 값이 반드시 0
        if (answer.charAt(0) == '0'){
            return "0";
        }
        
        return answer;
    }
}
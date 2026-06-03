import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[]  strNumbers = new String[numbers.length];
        String answer = "";
        int zeroCount = 0;
        for (int i = 0; i < numbers.length; i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strNumbers, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
           
        for (String s : strNumbers){
            answer += s;
            if (s.equals("0")){
                zeroCount++;
                }
            }
        
        System.out.println(zeroCount);
        
        if (zeroCount == strNumbers.length){
            return "0";
        }
        
        return answer;
    }
}
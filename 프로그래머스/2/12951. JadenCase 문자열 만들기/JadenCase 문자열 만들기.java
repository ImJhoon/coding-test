import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
    
        boolean findBlank = true;
        
        for (char c : ch) {
            if (c == ' '){
                findBlank = true;
                answer += ' ';
                continue;
            }
            
            if (findBlank == true) {
                answer += (String.valueOf(c)).toUpperCase();
                findBlank = false;
            } else {
                answer += c;
            }
        }
        
        return answer;
    }
}
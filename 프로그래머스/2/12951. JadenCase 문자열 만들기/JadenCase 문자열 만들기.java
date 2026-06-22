import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
    
        boolean findBlank = true;
        
        for (char c : ch) {
            if (c == ' '){
                findBlank = true;
                sb.append(" ");
                continue;
            }
            
            if (findBlank == true) {
                sb.append((String.valueOf(c)).toUpperCase());
                findBlank = false;
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
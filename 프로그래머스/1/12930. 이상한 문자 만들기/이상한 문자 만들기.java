import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                idx = 0;
                sb.append(" ");
                continue;
            }
            
            if (idx % 2 == 0) {
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            } else {
                sb.append(String.valueOf(s.charAt(i)).toLowerCase());
            }
            
            idx++;
        }
                          
        return sb.toString();
    }
}
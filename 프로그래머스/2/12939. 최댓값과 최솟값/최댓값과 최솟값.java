import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // System.out.println(Arrays.toString(arr));
        
        for (String str : arr) {
            if (max < Integer.parseInt(str)){
                max = Integer.parseInt(str);
            }
            if (min > Integer.parseInt(str)) {
                min = Integer.parseInt(str);
            }
        }
        sb.append(min + "").append(" ").append(max);
        
        return sb.toString();
    }
}
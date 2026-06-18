import java.util.*;

class Solution {
    public String solution(String s) {
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
        
        return min + " " + max;
    }
}
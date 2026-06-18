import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // System.out.println(Arrays.toString(arr));
        
        for (String str : arr) {
            int currentNum = Integer.parseInt(str);
            if (max < currentNum){
                max = currentNum;
            }
            if (min > currentNum) {
                min = currentNum;
            }
        }
        
        return min + " " + max;
    }
}
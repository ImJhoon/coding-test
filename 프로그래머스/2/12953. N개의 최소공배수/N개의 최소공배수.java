import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int bigNum = arr[arr.length - 1];
        int n = 1;
        
        while (true) {
            boolean find = true;
            int checkBigNum = bigNum * n;
            n++;
            
            for (int i = 0; i < arr.length - 1; i++) {
                if (checkBigNum % arr[i] == 0) {
                    continue;
                } else {
                    find = false;
                    break;
                }
            }
            
            if (find == true) {
                return checkBigNum;
            }
        }
    }
}
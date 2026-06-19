import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        int size = 0;
        
        for (int[] item : sizes) {
            int max = Math.max(item[0], item[1]);
            int min = Math.min(item[0], item[1]);
            
            item[0] = max;
            item[1] = min;
            
            if (width < item[0]) {
                width = max;
            }
            
            if (height < item[1]){
                height = min;
            }
        }
        
        size = width * height;
        
        return size;
    }
}
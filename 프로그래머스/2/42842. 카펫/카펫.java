import java.util.*;


// 전체 타일 = brown + yellow
// 내부 타일 = total - (2n + 2m - 4) -> 
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;

        for (int h = 1; h * h <= total; h++) {
            
            if (total % h == 0) {
                int w = total / h;
                
                if (total - 2 * (w + h - 2) == yellow){
                    answer[0] = w;
                    answer[1] = h;
                    break;
                }
            }
        }
        
        return answer;
    }
}
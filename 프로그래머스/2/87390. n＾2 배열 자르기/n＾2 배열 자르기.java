/*
i = 1 -> 1행 1열
i = 2 -> 1행 2열, 2행 1열, 2행 2열
i = 3 -> 1행 3열, 2헹 3열, 3행 1열, 3행 2열, 3행 3열
i = 4 -> 1행 4열, 2행 4열, 3행 4열, 4행 1열, 4행 2열, 4행 3열, 4행 4열
i 가 행일 경우 모두 해당 행에서 i 열까지 모두 i, 열일 경우 행 번호가 i보다 작거나 같다면 i

1 2 3 4
2 2 3 4
3 3 3 4
4 4 4 4
*/
import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)]; 
        
        for (int i = 0; i < answer.length; i++) {
            long index = left + i;
            int row = (int)(index / n); // 행
            int column = (int)(index % n); // 열
            
            if (row <= column) {
                answer[i] = column + 1;
            } else {
                answer[i] = row + 1;
            }
        }
        
        return answer;
    }
}
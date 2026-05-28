import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = 0;
        
        for (int i = 1; (i <= n && i <= m); i++) {
            if (n % i == 0 && m % i == 0){
                a = i;
            }
        }
        
        answer[0] = a;
        answer[1] = (n * m) / a;
        
        return answer;
    }
}
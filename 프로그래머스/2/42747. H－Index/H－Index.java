import java.util.*;


class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        
        for (int i = 0; i < n; i++){
            // 현재 논문을 포함하고 인용 횟수가 이것보다 크거나 같은 논문의 총 개수
            int h = n - i;
            if (citations[i] >= h){
                return h;
            }            
        }
        return 0;
    }
}
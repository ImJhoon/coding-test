import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        Map<String, Integer> countType = new HashMap<>();
        
        // 옷 종류 카운트
        for (int i = 0; i < clothes.length; i++) {
            countType.put(clothes[i][1], countType.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        // System.out.println(countType);
        
        if (countType.size() == 1) {
            return clothes.length;
        }
        
        int answer = 1;
        
        for (String key : countType.keySet()) {
            answer *= countType.get(key) + 1;
        }
        
        return answer - 1;
    }
}
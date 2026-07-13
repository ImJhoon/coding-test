import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        
        List<Integer> list = new ArrayList<>();
        int type = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < tangerine.length; i++){
            map.put(tangerine[i], (map.getOrDefault(tangerine[i], 0) + 1));
        }
        
        for (Integer i : map.keySet()){
            list.add(map.get(i));
        }
            
        Collections.sort(list);
        
        for (int i = 1; i <= list.size(); i++) {
            k -= list.get(list.size() - i);
            type++;
            
            if (k <= 0) {
                return type;
            }
        }
        return type;
    }
}
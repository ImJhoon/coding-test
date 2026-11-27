import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> countByType = new HashMap<>();

        for (String[] item : clothes) {
            String type = item[1];
            countByType.put(type, countByType.getOrDefault(type, 0) + 1);
        }

        int combinations = 1;
        for (int count : countByType.values()) {
            combinations *= count + 1;
        }

        return combinations - 1;
    }
}
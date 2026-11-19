import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<>();
        
        list.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            if (list.contains(words[i]) || words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                int a = i % n + 1;
                int b = i / n + 1;
                
                return new int[]{a, b};
            }
            
            list.add(words[i]);
        }

        return new int[]{0, 0};
    }
}
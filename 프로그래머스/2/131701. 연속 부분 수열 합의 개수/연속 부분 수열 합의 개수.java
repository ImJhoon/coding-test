import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        HashSet<Integer> sums = new HashSet<>();

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int offset = 0; offset < n; offset++) {
                int index = (start + offset) % n;
                sum += elements[index];
                sums.add(sum);
            }
        }

        return sums.size();
    }
}
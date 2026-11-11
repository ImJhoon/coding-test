import java.util.*;

class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        
        String tmp = String.valueOf(n);
        int[] digits = tmp.chars()
                        .map(num -> num - '0')
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .mapToInt(Integer::intValue)
                        .toArray();
        
        for (int digit : digits) {
            sb.append(digit);
        }
        
        return Long.parseLong(sb.toString());
    }
}
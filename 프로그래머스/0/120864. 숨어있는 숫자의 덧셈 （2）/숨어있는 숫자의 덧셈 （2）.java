import java.util.*;

class Solution {
    public int solution(String my_string) {
        return Arrays.stream(my_string.split("[^0-9]+"))
                .filter(n -> !n.isEmpty())
                .mapToInt(n -> Integer.parseInt(n))
                .sum();
    }
}
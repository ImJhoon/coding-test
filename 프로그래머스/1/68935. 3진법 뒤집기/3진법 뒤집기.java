import java.util.*;

class Solution {
    public int solution(int n) {
        int sum = 0;
        
        // 10진수 n을 3진법으로 변환 후 String 으로 데이터 타입 변경
        String ter = Integer.toString(n, 3);
        
        for (int i = 1; i <= ter.length(); i++) {
            sum += Math.pow(3, ter.length() - i) * Integer.parseInt(String.valueOf(ter.charAt(ter.length() - i)));
        }
        
        return sum;
    }
}
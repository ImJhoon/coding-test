import java.util.*;

class Solution {
    public String solution(String s) {
        //String s 를 char Array로 생성
        char[] charArr = s.toCharArray();
        
        // 오름차순 정렬
        Arrays.sort(charArr);
        
        // 텅 빈 StringBuilder 생성 후 charArr를 내림차순으로 정렬 후 string으로 변환
        return new StringBuilder().append(charArr).reverse().toString();
    }
}
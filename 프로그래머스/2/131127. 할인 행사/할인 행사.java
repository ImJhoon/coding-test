/*
XYZ 마트는 일정한 금액을 지불하면 10일동안 회원 자격을 부여
XYZ 마트는 회원을 대상으로 매일 한 가지 제품을 할인
할인하는 제품은 하루에 하나씩만 구매할 수 있음
정현이는 자신이 원하는 제품과 수량이 할인하는 날짜와 10일 연속으로 일치할 경우에 맞춰서 회원가입을 하려고 함

정현이가 원하는 제품 문자열 want
정현이가 원하는 제품의 수량을 나타내는 정수 배열 number
XYZ 마트에서 할인하는 제품을 나타내는 문자열 배열 discount

회원등록 시 정현이가 원하는 제품을 모두 할인 받을 수 있는 회원 등록 날짜의 총 일수를 return
*/
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> answerMap = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            answerMap.put(want[i], number[i]);
        }
        
        // System.out.println("정답 : " + answerMap);
        
        int count = 0;
        int sum = Arrays.stream(number)
                    .sum();
        int n = 0;
        
        while(discount.length - n >= sum) {
            Map<String, Integer> tryMap = new HashMap<>();
            
            int limit = 0;
            if (n + 10 >= discount.length) {
                limit = discount.length;
            } else {
                limit = n + 10;
            }
            
            for (int i = n; i < limit; i++) {
                
                int put = tryMap.get(discount[i]) == null ? 0 : tryMap.get(discount[i]);
                tryMap.put(discount[i], put + 1);    
            }
            
            n++;
            
            int check = 0;
            
            for (int i = 0; i < want.length; i++) {
                int tmp = tryMap.get(want[i]) == null ? 0 : tryMap.get(want[i]);
                
                if (tmp < answerMap.get(want[i])) {
                    // System.out.println("실패 시도: " + tryMap);
                    break;
                }
                
                check++;
                
                if (check == number.length) {
                    // System.out.println("성공 시도: " + tryMap);
                    count++;
                }
            }
        }
        
        return count;
    }
}
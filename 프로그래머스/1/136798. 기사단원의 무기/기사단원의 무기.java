/*
1. 숫자나라 기사단의 각 기사에게는 1번부터 number까지 번호 지정
2. 각 기사는  자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려고 함
3. 제한수치보다 큰 공격력을 가진 무기를 구매해야 하는 기사는 협약기관에서 정한 공격력을 가지는 무기를 구매해야 함
4. 무기의 공격력 1당 1kg의 철이 필요함. 무기점에서 무기를 모두 만들기 위해 철의 무게를 미리 계산하려 함
5. 기사단원의 수 number (정수) , 정해진 공격력 제한 limit(정수), 제한수치 초과한 기사가 사용할 무기의 공격력 power(정수)
6. 무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게를 return 해야 함
*/
import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        // 약수 구하기
        for (int i = 1; i <= number; i++) {
            int tmp = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    tmp++;
                }
            }
            
            if (tmp > limit) {
                answer += power;
            } else {
                answer += tmp;
            }
        }
        
        return answer;
    }
}
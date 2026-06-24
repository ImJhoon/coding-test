/*

이번 문제는 스스로 풀이했습니다.

[문제 풀이 방법]
1. ( 가 나오면 이후에 대응되는 )가 나와야 한 세트로 완성
2.  ( => count + 1, 
    ) => count - 1
    로 규칙 생성
3. count가 음수가 되면 이후 문자랑 무관하게 올바른 괄호를 만들 수 없음

* 스택을 사용하지 않고 풀이

[궁금한 점]
- 이번 문제의 카테고리인 스택을 사용하지 않고 풀이했는데 이런 경우에는 
스택을 활용하는 풀이도 구현해보는 것이 좋을까요? 아니면 일단 풀었으니 굳이 다시 풀 필요가 없을까요?

*/

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        
        // 문자열 배열로 변환 후 순회
        for (char c : s.toCharArray()) {
            // '(' 나오면 반드시 대응되는 ')' 나와서 count가 0이되어야함
            // 순회 도중 count가 음수가 되면 이후에 나오는 ( 개수와 무관하게 false
            if (c == '(') {
                count++;
            } else {
                count--;
            }
            
            if (count < 0) {
                answer = false;
                break;
            }
        }
        
        if (count == 0) {
            answer = true;
        }

        return answer;
    }
}

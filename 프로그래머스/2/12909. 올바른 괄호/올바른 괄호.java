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
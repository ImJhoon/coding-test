import java.util.*;

class Solution {
    public int solution(String s) {
        Deque<Character> rotation = new ArrayDeque<>();
        
        for (char ch : s.toCharArray()) {
            rotation.addLast(ch);
        }
        
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isValid(rotation)) {
                answer++;
            }
            rotation.addLast(rotation.removeFirst());
        }
        return answer;
    }
    
    private boolean isValid(Deque<Character> rotation) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char ch : rotation) {
            switch (ch) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if (stack.isEmpty() || stack.pop() != ch) {
                        return false;
                    }
            }
        }
        
        return stack.isEmpty();
    }
}
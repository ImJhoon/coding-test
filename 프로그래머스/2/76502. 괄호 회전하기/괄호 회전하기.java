import java.util.*;

class Solution {
    public int solution(String s) {
        Deque<Character> rotation = new ArrayDeque<>();
        
        for (char a : s.toCharArray()) {
            rotation.addLast(a);
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
    
    private boolean isValid(Deque<Character> deque) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char c : deque) {
            switch(c) {
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '(':
                    stack.push(')');
                    break;
                default:
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
                }
            }
                
        return stack.isEmpty();
    }
}
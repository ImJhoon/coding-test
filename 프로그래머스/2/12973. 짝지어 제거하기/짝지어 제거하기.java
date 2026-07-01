import java.util.*;

class Solution
{
    public int solution(String s) {   
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            // 스택이 비어있지 않고, 스택의 맨 위 문자와 현재 문자가 같다면
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
                } else {
                stack.push(c);
                }
            }   
        return stack.isEmpty() ? 1 : 0;
    }
}
    


/*
1. 영어 단어가 적힌 카드 뭉치 두 개를 선물로 받음
2. 원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용
3. 카드를 사용하지 않고 다음 카드로 넘어갈 수 없음
4. 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없음
*/
import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> cards1_list = Arrays.asList(cards1);
        List<String> cards2_list = Arrays.asList(cards2);
        List<String> goal_list = Arrays.asList(goal);
        
        int max = 0;
        for (int i = 0; i < cards1_list.size() - 1; i++) {
            max = goal_list.indexOf(cards1_list.get(i));
            
            if (goal_list.indexOf(cards1_list.get(i+1)) == -1) {
                continue;
            }
            
            if (max == -1 || max > goal_list.indexOf(cards1_list.get(i+1))) {
                return "No";
            }
        }
        
        max = 0;
        
        for (int i = 0; i < cards2_list.size() - 1; i++) {
            max = goal_list.indexOf(cards2_list.get(i));
            
            if (goal_list.indexOf(cards2_list.get(i+1)) == -1) {
                continue;
            }
            
            if (max == -1 || max > goal_list.indexOf(cards2_list.get(i+1))) {
                return "No";
            }
        }
        
        return "Yes";
        
    }
}
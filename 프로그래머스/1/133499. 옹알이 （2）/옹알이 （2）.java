/*
contains true 면 indexOf로 시작 위치구하고 길이 기반으로 subString? while 문 반복?
*/

import java.util.*;

class Solution {
    
    public static String[] canSay = {"aya", "ye", "woo", "ma"};
    
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            boolean tmp = canSayCheck(babbling[i], "");
            
            if (tmp == true) {
                answer++;
            } 
        }
    
        return answer;
    }
    
    public static boolean canSayCheck(String word, String previous) {
        if (word.isEmpty()) {
            return true;
        }
        
        for (String sound : canSay) {
            if (word.startsWith(sound) && !sound.equals(previous)) {
                return canSayCheck(word.substring(sound.length()), sound);
            }
        }
        
        return false;
    }
}
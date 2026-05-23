import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 문자열의 각 문자의 최신 위치를 중복 없이 저장하기 위한 HashMap 생성
        Map<Character, Integer> map = new HashMap<>();
        int sLength = s.length();
        
        // 자신과 동일한 알파벳의 가장 가까운 위치를 담는 배열
        int[] arr = new int[sLength];
        
        // 초기값 모두 -1로 설정
        for (int i = 0; i < sLength; i++){
            map.put(s.charAt(i), -1);
        }
        
        for (int i = 0; i < sLength; i++) {
            // 만약 처음 나온 알파벳이라면 -1 을 arr에 담기
            if (map.get(s.charAt(i)) == -1){
                arr[i] = -1;
            } else {
            // 이미 나왔던 알파벳이라면 인덱스 차이를 arr에 담기
            arr[i] = i - map.get(s.charAt(i));
            }
            // 각 알파벳의 최신 위치 업데이트
            map.put(s.charAt(i), i);
        }
        
        return arr;
    }
}
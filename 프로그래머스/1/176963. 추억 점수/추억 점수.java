/*
사진속에 나오는 인물의 그리움 점수를 모두 합산한 값이 해당 사진의 추억 점수가 됨
-> 리스트 안의 아이템 각각의 그리움 점수가 존재
그리움 점수가 없으면 합산에서 제외

그리워하는 사람의 이름을 담은 문자열 배열 name
각 사람별 그리움 점수를 담은 저수 배열 yearning
각 사진에 찍힌 인물의 이름을 담은 이차우너 문자열 배열 photo

만약 yearning이 name 보다 짧을경우 짧은 길이만큼 name의 끝에서부터 0을 채워줘야 함
*/
import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        Map<String, Integer> scoreMap = new HashMap<>();
        int[] answer = new int[photo.length];
        int nameMinusYearning = name.length - yearning.length;
        
        if (nameMinusYearning != 0) {
            for (int i = 0; i < nameMinusYearning; i++) {
                scoreMap.put(name[name.length - i], 0);
            }
        }
        
        for (int i = 0; i < yearning.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }
        
        System.out.println(scoreMap);
        
        for(int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                try {
                    int tmp = scoreMap.get(photo[i][j]);   
                    answer[i] += tmp;
                } catch(Exception e) {
                    continue;
                }
            }
        }
        
        return answer;
    }
}
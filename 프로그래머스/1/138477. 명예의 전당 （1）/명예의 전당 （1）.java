import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        /*
        1. 매일 1명의 가수가 노래 부름
        2. 시청자 문자 투표로 가수에게 점수 부여
        3. 매일 출연한 가수의 점수가 지금까지 출연 가수들의 점수 중 상위 K번째 이내면 해당 가수의
           점수를 명예의 전당 목록에 올림
        4. k일 다음부터는 출연 가수의 점수가 기존의 명예의 전당 목록의 k번째 순위의 가수 점수보다 더 높으면
           출연 가수의 점수가 명예의 전당에 오르게 되고 기존 k번째 순위의 점수는 명예의 전당에서 내려옴
        5. 매일 명예의 전당의 최하위 점수 배열 , 명예의 전당은 k 명까지 올라갈 수 있음
        */

        // List<Integer> lowScores = new ArrayList<>();
        int[] lowScores = new int[score.length];
        List<Integer> honorList = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        
        // List<Integer> test = new ArrayList<>(List.of(1, 5, 10, 6, 9));
        // test.sort((o1, o2) -> o1.compareTo(o2));
        // System.out.println(test);
        
        for (int i = 0; i < score.length; i++) {
            // 우선 명예의 전당에 새로 들어온 점수 추가
            honorList.add(score[i]);
            
            // 명예의 전당 자리 꽉 찼을 때 제일 작은 값 삭제 
            if (honorList.size() > k) {
                honorList.sort((o1, o2) -> o1.compareTo(o2));
                honorList.remove(0);

                min = honorList.get(0);
                
                lowScores[i] = min;
                continue;
            } 
            
            // 최하위 점수 구하는 로직
            if (score[i] <= min) {
                min = score[i];
            }
            
            lowScores[i] = min;
            
        }
        
        return lowScores;
    }
}
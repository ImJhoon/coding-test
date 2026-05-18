class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        // 합계 저장할 변수 선언
        int result = 0;
        for(int i = 0; i < absolutes.length; i++){
            //만약 signs[i]가 true면 양수, false면 음수
            if (signs[i] == false){
                absolutes[i] = -absolutes[i];
            }
            //정수들의 합 연산
            result += absolutes[i];
        }
       
        return result;
    }
}
class Solution {
    public int solution(int[] numbers) {
        //1 ~ 9 모두 더한 값은 45
        int result = 45;
        
        for (int i = 0; i < numbers.length; i++){
            result -= numbers[i];
        }
        return result;
    }
}
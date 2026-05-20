class Solution {
    public int solution(int left, int right) {
        
        int result = 0;
        
        for (int i = left; i <= right; i++){
            int divisorCount = 0;
            
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    divisorCount++;
                } 
            }
            
            if (divisorCount % 2 == 0){
                result += i;
            } else{
                result -= i;
            }
        }
        
        return result;
    }
}
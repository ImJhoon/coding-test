class Solution {
    public long solution(int n) {
        
        if (n == 1){
            return 1;
        }
        
        long[] memo = new long[n + 1];
        int answer = 0;
        
        memo[1] = 1;
        memo[2] = 2;
        
        for (int i = 3; i <= n; i++){
            memo[i] = (memo[i - 1] + memo[i - 2]) % 1234567;
        }
        
        return memo[n];
    }
}
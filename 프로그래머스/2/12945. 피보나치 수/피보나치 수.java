import java.util.*;

class Solution {
    public long solution(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
        }
        
        return arr[n] % 1234567;
    }
    // public long fibo(int n) {
    //     if (n <= 1) { return n; }
    //     return fibo(n - 1) + fibo(n - 2);
    // }
}

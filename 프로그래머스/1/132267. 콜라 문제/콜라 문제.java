class Solution {
    public int solution(int a, int b, int n) {
        
        // a : 콜라 b개를 받기 위해 필요한 빈 병
        // b : a개를 갖다 주었을 때 받는 콜라 개수
        // n : 보유한 빈 병의 개수
        
        /*
            a : 2 , b: 1, n : 20
            1) n : 20 - (20 / 2) * 1 = 10 , get : 10, total = 10
            2) n : 10 - (10 / 2) * 1 = 5 , get : 5, total = 15
            3) n : 5 - (5 / 2) * 1 = 3 , get : 2, total = 17
            4) n : 3 - (3 / 2) * 1 = 2, get : 1, total = 18
            5) n: 2 - (2 / 2) * 1 = 1, get : 1, total = 19
            6) end
        */
        
        int total = 0;
        int blank = 0;
        
        while (n >= a) {
            int remain = n % a;
            int get = (n / a) * b;
            
            total += get;
            n = (n / a) * b + n % a;
            
        }
        
        return total;
    }
}
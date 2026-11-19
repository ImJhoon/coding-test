/*
12 34 56 78 (1)
1 4 5 7 (2)
4 7 (3)
*/

class Solution
{
    public int solution(int n, int a, int b)
    {
        
        int count = 0;
        int tmp = 0;
        
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        
        while(true) {
            if (a % 2 == 1 && b % 2 == 0 &&  b - a == 1) {
                count++;
                break;
            }
            
            if (a % 2 == 0) {
                a /= 2;
            } else {
                a = (a + 1) / 2;
            }

            if (b % 2 == 0) {
                b /= 2;
            } else {
                b = (b + 1) / 2;
            }
            
            count++;
        }
        
        return count;
    }
}
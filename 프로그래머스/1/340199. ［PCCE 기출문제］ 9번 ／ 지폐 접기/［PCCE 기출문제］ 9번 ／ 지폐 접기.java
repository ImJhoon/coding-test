import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int count = 0;
        
        while (true) {
            boolean over = false;
            Arrays.sort(wallet);
            Arrays.sort(bill);
            
            for (int i = 0; i < wallet.length; i++) {
                if (wallet[i] < bill[i]) {
                    over = true;
                }
            }
            
            if (over == true) {
                bill[1] /= 2;
                count++;
            } else {
                break;
            }
        }
        
        return count;
    }
}
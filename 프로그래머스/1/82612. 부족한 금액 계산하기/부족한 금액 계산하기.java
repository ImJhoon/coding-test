class Solution {
    public long solution(int price, int money, int count) {
        long requireMoney = 0;
        
        for (int i = 1; i <= count; i++){
            // count 만큼 놀이기구를 타기 위해 필요한 금액 계산
            requireMoney += i * price;
        }
        
        // 만약 필요한 금액이 보유하고 있는 금액보다 싸다면 0 return
        if (requireMoney <= money){
            return 0;
        }
        
        // 추가로 필요한 금액 계산
        requireMoney -= money;
        
        return requireMoney;
    }
}
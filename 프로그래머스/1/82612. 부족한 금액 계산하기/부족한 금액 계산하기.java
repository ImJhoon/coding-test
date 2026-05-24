class Solution {
    public long solution(int price, int money, int count) {
        long requireMoney = 0;
        
        for (int i = 1; i <= count; i++){
            //내 돈보다 초과되는 금액을 money에 저장
            requireMoney += i * price;
        }
        
        if (requireMoney <= money){
            return 0;
        }
        
        requireMoney -= money;
        
        return requireMoney;
    }
}
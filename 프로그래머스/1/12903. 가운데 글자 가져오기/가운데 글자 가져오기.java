class Solution {
    public String solution(String s) {
        int middleIndex = s.length() / 2;
        
        if (s.length() % 2 == 1){
            return s.substring(middleIndex, middleIndex + 1);
        } else{
            return s.substring(middleIndex - 1, middleIndex + 1);
        }
    }
}
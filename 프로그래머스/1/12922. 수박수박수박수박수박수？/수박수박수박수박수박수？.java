class Solution {
    public String solution(int n) {
        
        String s = "수";
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 1; i < n; i++){
            if (i % 2 == 0){
                sb.append("수");
            } else {
                sb.append("박");
            }
        }
        s = sb.toString();
        return s;    
    }
}
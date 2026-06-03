class Solution {
    public int solution(String t, String p) {
        int pLen = p.length();
        int count = 0;
        
        for (int i = 0; i <= t.length() - pLen; i++) {
            for (int j = 0; j < pLen; j++){
                if (t.charAt(i + j) < p.charAt(j)){
                    count++;
                    break;
                }else if (t.charAt(i + j) == p.charAt(j)) {
                    if (pLen == j + 1){
                        count++;
                        break;
                    }
                    continue;
                }else {
                    break;
                }
            }
        }
        
        return count;
    }
}
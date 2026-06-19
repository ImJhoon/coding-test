class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int count = 0;
        int zeroCount = 0;
        
        while(true) {
            
            count++;
            
            String newS = s.replace("0", "");
            int sLen = s.length();
            int newSLen = newS.length();
            
            zeroCount += sLen - newSLen;
            
            String binary = Integer.toString(newSLen, 2);
            int val = Integer.parseInt(binary, 2);
            
            s = Integer.toString(val, 2);
            
            if (val == 1) {
                answer[0] = count;
                answer[1] = zeroCount;
                
                break;
            }
        }
        
        return answer;
    }
}
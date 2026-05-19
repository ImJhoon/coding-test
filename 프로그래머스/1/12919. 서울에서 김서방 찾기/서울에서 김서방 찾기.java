class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int w = 0;
        for(int i = 0; i < seoul.length; i++){
            if (seoul[i].equals("Kim")){
                w = i;
            }
        }
        
        answer = "김서방은 " + w +"에 있다";
        return answer;
    }
}
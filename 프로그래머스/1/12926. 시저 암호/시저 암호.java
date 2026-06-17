class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == ' ') {
                continue;
            }
            
            if (Character.isLowerCase(arr[i])) {
                if (arr[i] + n > 'z') {
                    arr[i] = (char) (arr[i] + n - 26);
                } else {
                    arr[i] = (char) (arr[i] + n);
                }
            }
            
            if (Character.isUpperCase(arr[i])) {
                if (arr[i] + n > 'Z') {
                    arr[i] = (char) (arr[i] + n - 26);
                } else {
                    arr[i] = (char) (arr[i] + n);
                }
            }
        }
        String answer = String.valueOf(arr);
        
        return answer;
    }
}
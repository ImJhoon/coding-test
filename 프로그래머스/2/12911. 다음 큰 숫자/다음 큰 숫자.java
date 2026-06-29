import java.util.*;

class Solution {
    public int solution(int n) {
        // n을 2진수 변환(string)
        // n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
        // 작은 자릿수부터 순회하며 처음 만나는 0을 1로 변환 후 10진수 변환
        
        int answer = 0;
        
        String binaryN = Integer.toString(n, 2);
        char[] nCharArr = binaryN.toCharArray();
        String bigBinaryN = "";
        
        
        Boolean find = false;
        int oneCount = 0;

        
        for (int i = 0; i < nCharArr.length; i++) {
            
            if (find == true && nCharArr[nCharArr.length - 1 - i] == '0'){
                nCharArr[nCharArr.length - 1 - i] = '1';
                for (int j = 0; j < oneCount - 1; j++) {
                    nCharArr[nCharArr.length - 1 - j] = '1';
                }
                bigBinaryN = String.valueOf(nCharArr);
                break;
            }
            
            if (nCharArr[nCharArr.length - 1 - i] == '1') {
                find = true;
                nCharArr[nCharArr.length - 1 - i] = '0';
                oneCount++;
            }
            
            //1100 -> 1 0011
            if (i == nCharArr.length - 1) {
                bigBinaryN = "1";
                for (int j = 0; j < nCharArr.length - oneCount + 1; j++) {
                    bigBinaryN += "0";
                }
                
                for (int j = 0; j < oneCount - 1; j++) {
                    bigBinaryN += "1";
                }
            }
        }

        answer = Integer.parseInt(bigBinaryN, 2);
        return answer;
    }
}
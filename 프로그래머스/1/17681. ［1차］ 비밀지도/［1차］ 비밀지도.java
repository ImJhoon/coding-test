import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // 정답 담을 배열 생성
        String[] answerArr = new String[n];
        // 각 row에 넣을 문자열 껍데기 생성
        String row = "";
        // 이진수로 변환한 값을 저장하기 위한 문자열 배열 생성
        String[] binaryArr1 = new String[n];
        String[] binaryArr2 = new String[n];
        
        // String.format() , Integer.toBinaryString() , .replace()를 활용하여
        // 문자열 형태로 변환된 이진수 값을 새로운 배열에 넣음
        for(int i = 0; i < n; i++){
            binaryArr1[i] = String.format("%" + n + "s",Integer.toBinaryString(arr1[i])).replace(" ", "0");
            binaryArr2[i] = String.format("%" + n + "s",Integer.toBinaryString(arr2[i])).replace(" ", "0");
        }
        
        // i번째 인덱스(row)의 각 위치(j)에 대응하는 값이 하나라도 1일 경우 #, 둘 다 0이라면 공백을 row에 넣음
        // 이후 row는 다음 row를 저장하기 위해 공백으로 초기화
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (binaryArr1[i].charAt(j) == '1' || binaryArr2[i].charAt(j) == '1'){
                    row += "#";
                } else {
                    row += " ";
                }
            }
            
            answerArr[i] = row;
            row = "";
        }
        
        return answerArr;
    }
}
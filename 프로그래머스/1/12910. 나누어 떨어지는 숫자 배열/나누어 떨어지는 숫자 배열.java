import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answerArrList= new ArrayList<>();
        int count = 0;
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % divisor == 0){
                count++;
                answerArrList.add(arr[i]);
            } 
        }
        
        if (count == 0){
            answerArrList.add(-1);
        }
        
        int[] answerArr = new int[answerArrList.size()];
        answerArrList.sort(null);
        
        for (int i = 0; i < answerArrList.size(); i++){
            answerArr[i] = answerArrList.get(i);
        }
        
    
        return answerArr;
    }
}
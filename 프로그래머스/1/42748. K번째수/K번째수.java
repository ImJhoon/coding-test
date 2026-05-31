import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] result = new int[commands.length];
        
        for (int x = 0; x < commands.length; x++) {
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];
            
            if(i == j){
                result[x] = array[i - 1];
                continue;
            }
            
            int[] newArr = new int[j - i + 1];
            int newArrIndex = 0;
            
            for (int iIndex = i; iIndex <= j; iIndex++){
                newArr[newArrIndex] = array[iIndex - 1];
                newArrIndex++;
            }
            
            Arrays.sort(newArr);
            result[x] = newArr[k - 1];
        }
        
        return result;
    }
}
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new LinkedList<>();
        
        int index = 0;
        int[] a = new int[1];
         
        while(index < arr.length){
            if (index == arr.length - 1){
                list.add(arr[index]);
                break;
            }
        
            if (arr[index] == arr[index + 1]){
                index++;
                continue;
            }
            
            list.add(arr[index]);
            
            index++;
        }
        
        
        return list.stream()
	.mapToInt(Integer::intValue)
    .toArray();
    }
}
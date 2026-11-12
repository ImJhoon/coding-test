// 5 10 80 90

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        int start = 0;
        int count = 0;
        int end = people.length;
        
         while (start < end) {
            if (start < end - 1 && people[start] + people[end - 1] <= limit) {
                start++;
            }

            end--;
            count++;
        }

        return count;
    }
}
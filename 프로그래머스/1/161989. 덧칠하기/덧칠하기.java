/*
- 페인트가 칠해진 길이가 n 미터인 벽이 있음
- 포스터를 붙였다가 철거할 때 테이프를 붙였다가 떼는데 페인트가 벗겨짐
- 벽에 페인트를 덧칠
- 넓은 벽 전체에 페인트를 새로 칠하는 대신 구역을 나눠 일부만 페인트를 새로 칠함
- 이를 위해 벽을 1미터 길이의 구역 n개로 나눔
- 각 구역에 왼쪽부터 순서대로 1번부터 n번까지 번호를 붙임
- 벽에 페인트를 칠하는 롤러의 길이는 m 미터
    - 롤러는 벽에서 벗어나면 안됨
    - 구역의 일부분만 포함되도록 칠하면 안 됨
    - 페인트를 칠하는 구역들을 완전히 칠한후 벽에서 롤러를 떼며, 이를 벽을 한 번 칠했다고 정의
- 한 구역에 페인트를 여러 번 칠해도 되고 다시 칠해야 할 구역이 아닌 곳에 페인트를 칠해도 되지만
다시 칠하기로 정한 구역은 적어도 한 번 페인트칠을 해야 함
- 목표: 예산을 아끼기 위해 페인트칠을 하는 횟수를 최소화 하려고 함
- 조건: n (벽 미터), m (롤러의 길이), 페인트를 칠하기로 정한 구역들의 번호가 담긴 정수 배열 section이 매개변수로 주어짐 
롤러로 페인트칠해야 하는 최소 횟수를 return
*/

import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        
        int index = section.length - 1;
        int count = 1;
        int i = 1;
        
        while(index - i >= 0) {
            int big = section[index];
            int small = section[index - i];
            
            if (big - small + 1 > m) {
                count++;
                index -= i;
                i = 1;
                continue;
            }
            
            i++;
        }
        
        return count;
    }
}
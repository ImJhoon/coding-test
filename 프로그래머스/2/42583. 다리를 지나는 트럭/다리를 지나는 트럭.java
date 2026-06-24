/*

문제를 스스로 풀이하기 힘들어서 AI의 도움을 받았습니다

[발생한 문제점]
1. 대기 트럭, 다리를 건너고 있는 트럭, 다리에 올라간 트럭의 카운트에 대해 모두 별도의 큐를 생성하는 방식으로 풀이를 접근했습니다.
2. 1번과 같이 문제를 접근하려고 하니 별도의 트럭 클래스를 생성하여 다리에 올라간 시간, 트럭의 무게를 선언하고, for문을 통해 매 시간 트럭의 카운트를 늘리고... 와 같이
   코드가 상당히 복잡해져서 해당 접근 방법으로는 못 풀겠다고 판단했습니다.

[문제 풀이 방법]
1. 위의 과정과 다른 접근 방식으로 풀어보려고 했지만 마땅한 방법이 떠오르지 않아 서칭을 통해 정답 코드를 분석했습니다.
2. 단순히 정답 코드만 작성하는 것이 아닌 정답 코드를 분석하며 직접 로직을 따라가보며 이해했을 시 주석을 다는 과정을 통해 문제를 이해헀습니다.

[궁금한 점]
- 큐를 활용하여 문제를 접근하는 것 까지는 성공했지만 잘못된 방식으로 접근하였습니다. 큐 활용 문제에서는 어떤 방식으로 접근해야 하는 지 궁금합니다.

*/

import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new ArrayDeque<>();
        int time = 0;
        int currentBridgeWeight = 0;
        
        // 다리 길이만큼 큐를 0으로 채워 '빈 다리' 만들기
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        
        int truckIndex = 0;
        
        // 대기 중인 트럭이 모두 다리에 올라갈 때 까지 반복
        while (truckIndex < truck_weights.length) {
            time++;
            
            // 다리의 맨 앞의 요소를 빼고, 현재 다리 무게에서 뺌
            currentBridgeWeight -= bridge.poll();
            
            int nextTruck = truck_weights[truckIndex];
            
            // 트럭이 올라갈 수 있으면 큐에 트럭을 넣고 무게 추가
            if (currentBridgeWeight + nextTruck <= weight) {
                bridge.offer(nextTruck);
                currentBridgeWeight += nextTruck;
                // 다리 위로 지나가고 있는 트럭 수 증가
                truckIndex++;
            } else {
                bridge.offer(0);
            }
        }
        
        // 마지막 트럭이 다리 위로 올라갔을 때 while문이 종료되므로 마지막 트럭이
        // 다리를 건너기 위해 걸리는 시간을 추가로 더해줌
        return time + bridge_length;
    }
}

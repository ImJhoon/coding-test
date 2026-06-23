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
class Solution {
    public String solution(int[] food) {
        // 선수들은 1대 1로 대결
        // 매 대결마다 음식의 종류, 양 바뀜
        // 대결은 준비된 음식들을 '일렬' 로 배치 후 
        // 한 선수는 왼쪽부터, 다른 선수는 오른쪽부터 음식을 순서대로 먹으며 이동
        // 중앙에는 물이 배치, 먼저 물을 마시는 사람이 승리
        
        // [조건]
        // 공정성을 위해 두 선수가 먹는 음식의 종류와 양, 순서가 같아야 함
        // 이번 대회부터는 칼로리가 낮은 음식을 먼저 먹을 수 있게 배치
        
        // 리턴 값
        // 수용이가 준비한 음식의 양을 칼로리가 적은 순서대로 나타내는 정수 배열 food가
        // 주어졌을 때, 대회를 위한 음식의 배치를 나타내는 문자열을 return
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int currentFoodIndex = i;
            int currentFood = food[i];
            for (int j = 0; j < currentFood / 2; j++) {
                sb.append(currentFoodIndex + "");
            }
        }
        
        sb.append("0");
            
        System.out.println(sb.toString());
        String tmp = sb.toString();
        
        for (int i = 1; i < tmp.length(); i++) {
            sb.append(tmp.charAt(tmp.length() - 1 - i));
        }
        
        return sb.toString();
    }
}
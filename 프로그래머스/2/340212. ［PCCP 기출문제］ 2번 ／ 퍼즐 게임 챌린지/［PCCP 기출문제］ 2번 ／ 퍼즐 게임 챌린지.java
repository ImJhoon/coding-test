import java.util.*;

public class Solution {
public int solution(int[] diffs, int[] times, long limit) {
        int answer = 1; // 숙련도 1가 최소
        int left = 1;
        int right = 100_000;
        while (left <= right) { // left > right
            int mid = (left + right) / 2; // 중점을 구함
            if (check(diffs, times, limit, mid)) {
                answer = mid; // 임시로 mid를 답을 잡음
                right = mid - 1;
            } else  {
                left = mid + 1;
            }
        }

        return answer;
    }

    private boolean check(int[] diffs, int[] times, long limit, int i) {
        long totalTime = times[0];
        for (int j = 1; j < diffs.length; j++) {
            long curTime = times[j]; // 0번째는 이미 넣어줌
            if (diffs[j] <= i) {
                totalTime += curTime;
            } else {
                long count = diffs[j] - i; // 반복횟수
                long prevTime = times[j - 1];
                totalTime += count * (prevTime + curTime) + curTime;
            }
            if (totalTime > limit) {
                return false;
            }
        }
        return true;
    }
}
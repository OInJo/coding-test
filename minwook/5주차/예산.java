import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d); // 오름차순 정렬 (최대 물품 지원을 위해 최솟값부터 진행)
        for(int n : d){ // 부서별 금액 접근
            budget -= n; // 예산에서 금액 감소
            if(budget >= 0) // 예산이 초과되기전까지 덧셈
                answer++;
        }
        return answer;
    }
}
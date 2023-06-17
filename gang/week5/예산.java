import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);     // 신청 금액이 낮은 부서부터 주기 위해 오름차순으로 정렬
        for(int i=0; i< d.length; i++) {
            if(budget < d[i]) {     // 예산이 신청금액보다 적으면 줄 수 없으므로 정지
                break;
            }
            budget -= d[i];     // 예산에서 신청 금액 뺌
            answer++;           // 예산 할당 받은 부서 수 증가
        }
        return answer;
    }
}
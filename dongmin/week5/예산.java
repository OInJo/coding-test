import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);     //정렬을 통해 낮은 값 부터 계산하며 최대한 많은 부서의 신청을
                            //받을 수 있도록 한다.

        for (int i = 0; i < d.length; i++) {
            if(budget-d[i]>=0){         //예산에서 신청 금액을 뺀 값이 0이상 일 경우
                budget-=d[i];
                answer++;
            }
        }
        return answer;
    }
}
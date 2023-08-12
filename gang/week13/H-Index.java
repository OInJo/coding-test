import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); // 논문들 오름차순으로 정렬

        for (int i = 0; i < citations.length; i++) {
            int hIndex = citations.length - i;  // 오름차순이기 때문에 현재 논문의 인용수 이상인 논문들 구함
            if (citations[i] >= hIndex) {   // 현재 논문의 인용수가 인용수 이상인 논문들보다 수가 높으면 그때가 H-Index
                answer = hIndex;
                break;
            }
        }

        return answer;
    }
}

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();   // 결과 갯수를 담을 배열
        int[] days = new int[progresses.length];    // 배포까지의 일수를 담을 배열

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                days[i]++;
            }
        }

        int prevDay = days[0];  // 이전 일수
        int cnt = 1;    // 기본적으로 1개 이상은 배포

        for (int i = 1; i < days.length; i++) {
            if (days[i] > prevDay) {    // 현재 기능의 배포까지의 일수가 이전 기능의 배포까지의 일수보다 크면
                answerList.add(cnt);    // 배포를 못하므로 결과 갯수 담음
                prevDay = days[i];      // 현재 기능의 배포까지의 일수를 이전 기능의 배포까지의 일수로 변경
                cnt = 1;                // 다시 1로 지정
            } else {
                cnt++;                  // 아닌 경우 같이 배포가 가능하므로 증가
            }
        }

        answerList.add(cnt);    // 마지막까지 남은 기능의 갯수 추가

        int[] answer = new int[answerList.size()];  // ArrayList를 그냥 int 배열로 변경
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}

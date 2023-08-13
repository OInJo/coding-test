class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        int matchCnt = 0;
        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                if(lottos[i] == 0) {    // 로또 번호가 0인 경우 zeroCnt 증가
                    zeroCnt++;
                    break;
                }
                else if(lottos[i] == win_nums[j]) { // 로또 번호와 당첨 번호가 같은 경우 matchCnt 증가
                    matchCnt++;
                }
            }
        }

        answer[0] = 7 - (zeroCnt+matchCnt); // 최고 순위는 당첨 횟수와 0인 횟수이고 순위이기 때문애 7에서 빼준다

        if(matchCnt == 0) { // 만약 당점 번호가 없고
            if(zeroCnt == 0) {  // 0인 숫자도 없으면
                answer[0] = 6;  // 최고 순위도 6위
            }
            answer[1] = 6;  // 0인 숫자가 있어도 최저 순위는 6위
        }
        else {
            answer[1] = 7 - matchCnt;   // 당첨 번호가 있으면 최저 순위는 7에서 당첨번호 뺀 수
        }

        return answer;
    }
}
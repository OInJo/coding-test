import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(completion);    //완주자를 오름차순으로 정렬
        Arrays.sort(participant);   //참가자를 오름차순으로 정렬

        for (int i = 0; i < completion.length; i++) {
            if(!completion[i].equals(participant[i])) { //정렬된 상태에서 다른값이 있으면 정지하고 값을 저장
                answer=participant[i];
                break;
            }
        }
        if(answer.equals("")) {     // answer가 빈 값이라면 참여자 중 마지막 선수가 완주하지 못한 선수
            answer = participant[participant.length - 1];
        }
        return answer;
    }
}
class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            answer += i%2==0 ? "박" : "수";     //i가 2로 나누어 떨어지면 "박"을 그렇지 않으면 "수"를 answer에 저장한다
        }
        return answer;
    }
}
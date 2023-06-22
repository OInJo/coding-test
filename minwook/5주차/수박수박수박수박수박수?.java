class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i=0; i<n; i++){ 
            if(i%2==0) // 0부터 시작 짝수는 전부 수
                answer += "수";
            else // 1부터 시작 홀수는 전부 박
                answer += "박";
        }
        return answer;
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        int i = s.length() / 2;
        if(s.length() % 2 == 0) {   // 길이가 짝수인 경우
            answer = s.substring(i-1,i+1);  // 길이의 절반-1과 +1의 값을 가져옴
        }
        else {  // 홀수인 경우
            answer = s.substring(i,i+1);    // 길이의 절반+1의 값을 가져옴
        }
        return answer;
    }
}
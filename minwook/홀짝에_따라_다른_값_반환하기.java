class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0) { // 짝수일 경우 제곱
            for (n = n; n > 0; n-=2){
                answer += n*n;
            }
        } else { // 홀수일 경우 덧셈
            for (n = n; n>0; n-=2){
                answer += n;
            }
        }
        return answer;
    }
}
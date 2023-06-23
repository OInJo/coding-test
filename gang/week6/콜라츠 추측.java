class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;       // num의 범위가 int형보다 크기 때문에 long형으로 바꿈
        while(n != 1) {     // n이 1이 아닐때까지 반복
            if(n % 2 == 0) {
                n /= 2;
            }
            else {
                n = n * 3 + 1;
            }
            answer++;

            if(answer == 500) {     // 횟수가 500번이면 -1 리턴
                return -1;
            }
        }
        return answer;
    }
}
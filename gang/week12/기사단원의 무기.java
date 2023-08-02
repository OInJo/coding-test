class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++) {
            if(divisor(i) > limit) {    // 공격력 제한보다 높으면
                answer += power;    // 제한 공격력 추가
            }
            else {
                answer += divisor(i);
            }
        }
        return answer;
    }

    public int divisor(int num) {
        int cnt = 0;
        for (int i = 1; i * i <= num; i++) {    // 제곱근 사용
            if(i*i == num) {
                cnt++;
            }
            else if (num % i == 0) {
                cnt += 2;
            }
        }
        return cnt;
    }
}
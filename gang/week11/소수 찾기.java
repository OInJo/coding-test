class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++) {
            if(prime(i)) {
                answer++;
            }
        }
        return answer;
    }

    public boolean prime(int num) {
        for (int i = 2; i * i <= num; i++) {     // 시간 단축을 위해 제곱 사용
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
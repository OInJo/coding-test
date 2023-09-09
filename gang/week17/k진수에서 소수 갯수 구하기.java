import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder conversion = new StringBuilder(); //변환한 값을 담을 배열

        while (n > 0) { // 진수 변환
            conversion.append(n % k);
            n /= k;
        }

        String[] num = conversion.reverse().toString().split("0");  // 변환한 값을 역순하고 String형으로 나눈뒤, 0을 기준으로
                                                                    // 나눠서 배열에 담음
        for(int i=0; i<num.length; i++) {
            if(!num[i].equals("") && isPrime(Long.parseLong(num[i]))) { // 배열이 비워있지 않고, 소수인 경우 값 증가
                answer++;
            }
        }
        return answer;
    }

    private boolean isPrime(long num) { // 소수 판별 함수
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) { // 시간을 더 줄이기 위해 2로 나눠지는 경우 소수가 아니므로 false 리턴
            return false;
        }
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public static int[] memo = new int[1000000];    // 이전 피보나치 값을 담기 위한 배열

    public int solution(int n) {
        return fibo(n);
    }

    public int fibo(int n) {
        if (n < 2) {
            return n;
        }

        if (memo[n] != 0) { // 지금 수의 피보나치를 이미 계산한적이 있다면 바로 그 값을 리턴
            return memo[n];
        }

        memo[n] = (fibo(n - 1) + fibo(n - 2)) % 1234567;
        return memo[n];
    }
}

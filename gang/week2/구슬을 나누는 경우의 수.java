import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        // 서로다른 n개중 r개를 뽑는 조합의 수는 n! / (n-r)! * r! 이다.
        BigInteger numer = factorial(balls);
        BigInteger denom = factorial(balls - share).multiply(factorial(share)); //BigInteger에서 곱하기 사용법
        BigInteger answer = numer.divide(denom);    // BigInteger에서 나눗셈 사용법
        return answer;
    }

    public BigInteger factorial(int n) {    //공식에서 팩토리얼을 사용하기 때문에 재귀함수를 이용하어 함수를 구현했다
                                            //팩토리얼을 사용하면 값이 매우 커지기 때문에 BigInteger를 사용했다.
        if (n == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));    //int형 n을 BingInteger형으로 변환
        }
    }
}

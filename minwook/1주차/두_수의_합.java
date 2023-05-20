import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger num1 = new BigInteger(a); // 자릿수를 초과하는 큰 정수를 처리하기 위한 BigInteger 사용
        BigInteger num2 = new BigInteger(b);
        String answer = num1.add(num2) + ""; // add 함수로 덧셈 ( 사칙연산 사용 시 에러가 발생 )
        return answer;
    }
}
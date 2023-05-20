import java.math.BigInteger;

class P181846 {
    public String solution(String a, String b) {

        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);

        BigInteger sum = num1.add(num2);

        String answer = String.valueOf(sum);

        return answer;
    }
}
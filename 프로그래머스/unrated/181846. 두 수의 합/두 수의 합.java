import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger intA= new BigInteger(a);
        BigInteger intB= new BigInteger(b);

        BigInteger answer = intA.add(intB);

        return answer.toString();
    }
}
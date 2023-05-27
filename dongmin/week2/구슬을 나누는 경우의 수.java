import java.math.BigInteger;
class Solution {

    public BigInteger factorial(int num) {
        BigInteger result=new BigInteger("1");
        for(int i=1; i<=num; i++) {
            result=result.multiply(new BigInteger(Integer.toString(i)));
        }
        return result;
    }

    public BigInteger solution(int balls, int share) {      //값이 Integer로 표현할 수 있는 값을 넘어서므로 BigInteg형으로 반환

        return factorial(balls).divide((factorial(balls-share).multiply(factorial(share))));    //서로 다른 n개 중 m개를 뽑는 경우의 수 공식
    }



}

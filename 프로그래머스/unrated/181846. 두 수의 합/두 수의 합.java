import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {        
        BigInteger intA= new BigInteger(a);         //주어진 문자열 a를 기반으로 BigInteger 객체 intA를 생성
        BigInteger intB= new BigInteger(b);         //주어진 문자열 b를 기반으로 BigInteger 객체 intB를 생성    

        BigInteger answer = intA.add(intB);         //BigInteger class에 add() 메서드를 사용해 두 값을 더함

        return answer.toString();                   //toString() 메서드를 사용해 BigInteger 객체를 문자열로 변환해서 반환
    }
}
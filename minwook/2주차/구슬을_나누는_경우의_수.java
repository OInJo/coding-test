import java.math.*;

class Solution { // int로 하다가 계속 오버플로우 때문인지 테스트케이스 통과 안되길래 BigInteger 사용
  public BigInteger solution(int balls, int share) {
        return factorial(balls).divide((factorial(balls-share).multiply(factorial(share)))); // 조합 구하는 식
    }
    
    public BigInteger factorial(int num) {   // 팩토리얼 함수 구현
        BigInteger bigNum = new BigInteger("1");                        
        for(int i=1; i<num+1; i++) {
            bigNum = bigNum.multiply(new BigInteger(Integer.toString(i)));  
        }
        return bigNum;
    }
 
}

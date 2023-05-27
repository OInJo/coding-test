import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denominator =  denom1*denom2;               //분모
        int numerator = numer1*denom2+numer2*denom1;    //분자

        for(int i=numerator;i>1;i--){       //i의 값을 분자의 더한 값으로 시작하여 1씩 낮춤 
            if (denominator % i == 0 && numerator % i == 0) {       //i의 값을 위에서부터 1씩 낮추면서 분자와 분모의 최대 공약수가 나올 경우 
                                                                    //두 수를 i의 값으로 나눔
                denominator/=i;
                numerator/=i;
            }

        }
        int [] answer ={numerator,denominator};     //0번째 인덱스에 분자를, 1번째 인덱스에 분모를 넣어줌.
        return answer;
    }
}
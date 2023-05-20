import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denominator =  denom1*denom2;   //분모
        int numerator = numer1*denom2+numer2*denom1;

        for(int i=numerator;i>1;i--){
            if (denominator % i == 0 && numerator % i == 0) {
                denominator/=i;
                numerator/=i;
            }

        }
        int [] answer ={numerator,denominator};
        return answer;
    }
}
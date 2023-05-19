import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int num) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
            }
        }
        
        int [] result=new int [divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            result[i]=divisors.get(i);
        }

        return result;
    }
}
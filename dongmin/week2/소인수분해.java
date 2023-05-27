import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> arr = new ArrayList();

        for (int i = 2; i <= n; i++) {
            if(n%i==0) {
                while (n % i == 0)
                    n /= i;
                arr.add(i);
            }
        }

        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> arr = new ArrayList();        //ArrayList는 배열의 크기를 지정하지 않아도 됨.    

        for (int i = 2; i <= n; i++) {
            if(n%i==0) {
                while (n % i == 0)      //몫이 나누어 떨어질때까지 i로 값을 나눔.
                    n /= i;
                arr.add(i);             
            }
        }

        int[] answer = new int[arr.size()];         //answer 배열에 크기는 List형 arr에 크기
        for (int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
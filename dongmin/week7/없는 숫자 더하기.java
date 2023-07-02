import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> num = new ArrayList<>();
        for(int i:numbers)
            num.add(i);     //numbers의 값들을 List형 num에 넣어줌
        for (int i = 0; i < 10; i++) {
            if (!num.contains(i))       //없는 값을 answer에 더함
                answer += i;
        }

        return answer;
    }
}
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        answer[0] = (int) Arrays.stream(num_list).filter(n -> n % 2 == 0).count();  //Arrays.stream(num_list)를 통해 배열을 스트림으로 변환.
                                                                                    //filter 메서드를 사용하여 조건을 지정, 
                                                                                    //count 메서드를 사용하여 조건의 맞는 개수를 찾음
        answer[1] = (int) Arrays.stream(num_list).filter(n -> n % 2 != 0).count();

        return answer;
    }
}
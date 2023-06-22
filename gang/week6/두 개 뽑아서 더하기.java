import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> result = new HashSet<>();  // 더한 값중 중복값을 넣지 않기 위해 HashSet 사용
        for(int i=0; i<numbers.length; i++) {
            for(int j = i+1; j<numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);    // 반복문으로 더한 값 넣기
            }
        }

        int[] answer = new int[result.size()];  // HashSet을 Int형 변수로 바꾸기 위해 배열 선언
        for(int i = 0; i< answer.length; i++) {
            answer[i] = result.toArray(new Integer[answer.length])[i];  // toArray 함수로 바꾸기
        }
        Arrays.sort(answer);    // 오름차순 정렬
        return answer;
    }
}
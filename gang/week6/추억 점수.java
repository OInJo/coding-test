import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];   // 추억 점수를 담을 배열
        Map<String, Integer> memory = new HashMap<>();  // 사람의 이름과 각 추억점수를 key, value로 매핑하기 위해 선언

        for (int i = 0; i < name.length; i++) {     // 사람과 추억 점수의 길이는 같으니 반복문으로 채워줌
            memory.put(name[i], yearning[i]);
        }

        for(int i = 0; i < photo.length; i++) {
            int score = 0;
            for(int j = 0; j < photo[i].length; j++) {
                String person = photo[i][j];
                score += memory.getOrDefault(person, 0);    // getOrDefault 함수를 사용해서 person의 값과 memory의 key가 일치하면
            }                                               // value를 넣고, 없으면 0을 넣음
            answer[i] = score;  // 다 더한 추억 점수를 배열에 넣음
        }
        return answer;
    }
}

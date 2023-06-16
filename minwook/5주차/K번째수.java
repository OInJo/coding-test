import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 결과값은 commands의 개수만큼

        for (int i = 0; i < commands.length; i++) {
            int[] subArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]); // array에서 i, j사이의 배열 가져오기
            Arrays.sort(subArray); // 오름차순 정렬
            answer[i] = subArray[commands[i][2] - 1]; // k번째 수
        }

        return answer;
    }
}

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int l =0; l < commands.length; l++) {
            int i = commands[l][0] - 1;     // i는 몇번째 위치를 나타내만 실제 인덱스는 1 작기 때문에 -1
            int j = commands[l][1];         // j도 몇번째 까지의 위치를 나타내서 원래는 -1을 해야 하지만 copyOfRange를 사용하기 위해 그대로 사용
            int k = commands[l][2] - 1;     // k도 몇번째 인지 나타내는 수지만 실제 인덱스는 1 작기 때문에 -1

            int[] arrays = Arrays.copyOfRange(array, i, j); // copyOfRange는 배열을 복사하는 함수로 (원본 배열, 시작 인덱스, 끝 인덱스)
            Arrays.sort(arrays);        // 오름차순으로 정렬     // 끝 인덱스보다 -1 된 인덱스까지 복사됨
            answer[l] = arrays[k];      // 오름차순한 배열에서 k번째 값을 넣음
        }
        return answer;
    }
}
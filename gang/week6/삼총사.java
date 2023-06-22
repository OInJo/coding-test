import java.util.Arrays;

class Solution {
    public int solution(int[] number) {
        int count = 0;
        for(int i = 0; i < number.length - 2; i++) {    // 3중 for문을 사용하여 모든 경우의 수를 더해서 0인지 확인
            for(int j = i + 1; j < number.length - 1; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

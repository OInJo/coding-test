import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sorted = Arrays.copyOf(emergency, emergency.length);  //emergency 배열을 복사해서 sorted배열 생성
        Arrays.sort(sorted);    //복사한 배열을 오름차순으로 정렬

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                // 반복문으로 기존 emergency배열과 오름차순한 배열을 비교해서 같은 값이 나오면
                if (emergency[i] == sorted[j]) {
                    answer[i] = emergency.length - j;   //전체 길이에서 오름차순한 배열에서의 값 index를 빼서 기존 배열에 넣음
                    break;
                }
            }
        }
        return answer;
    }
}

import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {        //ex)  1,2,3,4,5,6,7
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if(emergency[j]>emergency[i])   //각각 값을 비교하여 비교 당하는 값이 더 크면 i번째 answer를 증가시킨다.
                    answer[i]++;
            }
            answer[i]++;
        }


        return answer;
    }
}
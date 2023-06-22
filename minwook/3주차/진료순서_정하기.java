import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length]; // 진료 순서 배열 개수만큼 지정
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){ // 이중 for문으로 각 응급도 별로 전체 응급도 비교
                if(emergency[i] < emergency[j]) // 응급도가 높을 경우
                    answer[i]++; // 순서 + 1
            }
            answer[i]++; // 순서가 0부터 시작해서 + 1
        }
        return answer;
    }
}
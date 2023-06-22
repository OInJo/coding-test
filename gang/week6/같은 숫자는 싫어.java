import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i< arr.length - 1; i++) {
            if(arr[i] != arr[i + 1]) {  // 현재 값과 다음 값이 다르면
                result.add(arr[i]);     // 값을 배열엔 넣음
            }
        }

        result.add(arr[arr.length - 1]);    // arr 배열의 마지막 값을 넣음

        int[] answer = new int[result.size()];
        for(int i =0; i<answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
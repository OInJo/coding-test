import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>(); // 동적 배열 리스트 선언
        for (int i = 1; i < n + 1; i++) { // 리스트에 약수 넣기
            if (n % i == 0) {
                answerList.add(i);
            }
        }
        
        int size = answerList.size(); // 리스트 크기 선언
        int[] answer = new int[size]; // 정적 배열 선언
        for (int i = 0; i < size; i++) { // 리스트 값 -> 정적 배열
            answer[i] = answerList.get(i);
        }
        return answer; // 정적 배열 리턴
    }
}
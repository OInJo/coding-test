import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> index = new ArrayList<>();   // 2가 몇개인지 모르니 ArrayList 배열 선어
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {  // arr배열의 값이 2일 때 그 값의 index를 배열에 저장
                index.add(i);
                num++;  // 2의 개수가 몇개인지 확인 용도
            }
        }

        if (num == 0) { // 배열에 2가 없으면
            return new int[]{-1};   // -1 리턴
        } else {
            // index 배열의 마지막 값 - 첫벗째 값 + 1이 배열의 총 크기
            int[] answer = new int[index.get(index.size()-1) - index.get(0) + 1];
            // 첫번째 2와 마지막 2 사이의 값 배열에 담기
            for (int i = index.get(0); i <= index.get(index.size() - 1); i++) {
                answer[i-index.get(0)] = arr[i];
            }
            return answer;
        }
    }
}

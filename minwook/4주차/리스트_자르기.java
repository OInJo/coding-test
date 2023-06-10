import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        if (n == 1) {
            sliceList(list, 0, slicer[1], 1, num_list);
        } else if (n == 2) {
            sliceList(list, slicer[0], num_list.length, 1, num_list);
        } else if (n == 3) {
            sliceList(list, slicer[0], slicer[1], 1, num_list);
        } else {
            sliceList(list, slicer[0], slicer[1], slicer[2], num_list);
        }
        int[] answer = list.stream().mapToInt(x -> x).toArray(); // 리스트 -> 배열로 변환
        return answer;
    }
    
    public void sliceList(List<Integer> answerList, int start, int end, int step, int[] num_list) { // 리스트 자르는 함수
        for (int i = start; i < num_list.length && i <= end; i += step) {
        answerList.add(num_list[i]);
    }
 }
}

// 경우에 따라 리스트를 자르는 방법을 다르게함
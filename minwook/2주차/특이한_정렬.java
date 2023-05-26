import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = sortArray(numlist, n); // 정렬 함수
        return answer;
    }
    
    public static int[] sortArray(int[] numList, int n) {
        Integer[] integerArray = Arrays.stream(numList).boxed().toArray(Integer[]::new); // int 배열은 Arrays.sort 사용 불가 Integer 배열로 변경
        Arrays.sort(integerArray, Collections.reverseOrder()); // 내림차순 정렬 (절댓값 계산 시 값이 큰게 앞으로 오게함)
        Arrays.sort(integerArray, Comparator.comparingInt(num -> Math.abs(num - n))); // 절댓값 계산 후 정렬
        return Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray(); // int 배열로 변환
    }
}
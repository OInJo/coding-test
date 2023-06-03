import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int min = 1000000; // 인덱스와 비교값 (최대 길이보다 크면 됨)
        int max = 0; // 인덱스와 비교값 (최소 길이보다 작으면 됨)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) { // 인덱스가 2일 경우
                min = Math.min(min, i); // 처음 2가 나온 인덱스 추출
                max = Math.max(max, i); // 마지막 2가 나온 인덱스 추출
            }
        }

        if (min <= max) { // 2가 있을 경우
            return Arrays.copyOfRange(arr, min, max + 1); // 2와 2사이의 배열 삽입
        } else {
            return new int[]{-1}; // 아니면 -1 출력
        }
    }
}
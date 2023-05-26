import java.util.Arrays; 
class Solution {
    
    public static int[] removeDuplicates(int[] arr) { // 0을 전부 제거하고 중복을 없애주는 함수
        arr = Arrays.stream(arr)
                   .filter(num -> !(num == 0)) // 값이 0 이면 filter
                   .toArray();
        return Arrays.stream(arr).distinct().toArray(); // 중복된 값 하나만 남김
    }
    
    public int[] solution(int n) {
        int[] answer = new int[n]; // 메모리 낭비가 심해서 리스트가 효율적일 것 같음
        int i = 1;
        int j = 0;
        while(n>1){ // 소인수분해 시작 n이 1보다 크면
            i++; // 지속적으로 나누는 값 +1
            if(n%i == 0) 
            {
                n /= i; // 나눈 값 n에 대입
                answer[j] = i; // 인수 삽입
                i = 1; // 나누는 값 초기화
                j++; // 배열 인덱스 + 1
            }
        }
        return removeDuplicates(answer); // 중복과 0을 제거한 뒤 출력
    }
}
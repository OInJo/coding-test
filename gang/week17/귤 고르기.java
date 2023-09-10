import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] cnt = new int[10000001];
        for(int i=0; i < tangerine.length; i++) {
            cnt[tangerine[i]]++;    // 귤의 갯수 증가
        }

        int[] sorted = Arrays.stream(cnt)
                .filter(value -> value != 0)    // 0인 값 제외
                .boxed() // int를 Integer로 변환
                .sorted(Comparator.reverseOrder()) // 내림차순 정렬
                .mapToInt(Integer::intValue) // Integer를 다시 int로 변환
                .toArray();

        for(int i=0; i<sorted.length; i++) {    // 귤의 갯수를 가장 많은 것부터 빼서 1보다 작아질 경우 그 순간의 종류가 최소
            k -= sorted[i];                     // k개를 담는 종류의 최소를 구하는 것이기 때문에 1보다 작아지더라도
            answer++;                           // 그 종류의 귤 갯수를 덜 담으면 되는것이기 때문에 종류는 증가
            if(k < 1) {
                return answer;
            }
        }

        return answer;
    }
}
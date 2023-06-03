import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array); // 가까운 수가 여러 개일 경우 더 작은 수를 먼저 넣기위해 오름차순 정렬
        int answer = 0;
        int com = 100; // 가까운 수를 판별하기위한 비교 대상
        for(int i : array){
            if(Math.abs(n-i) < com){ // n과 가까운 수를 판별하기 위해 절댓값으로 n과 배열에 담긴값의 차이를 비교
                answer = i; // 배열에 담긴 값 answer에 대입
                com = Math.abs(n-i); // 비교값 변경
            }
        }
        return answer;
    }
}
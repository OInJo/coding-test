import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); // 오름차순 (내림차순이 더 편한데 int[] 구현 복잡)
        for(int i=score.length-m; i>=0; i-=m){
            answer += score[i] * m;
        }
        return answer;
    }
}
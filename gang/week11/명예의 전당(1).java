import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] rank = new int[k];
        rank[0] = score[0];
        int last = score[0];
        answer[0] = score[0];

        if (score.length <= k) {    // score 배열의 크기가 k 이하일 경우 모든 값이 명예의 전당에 오름
            for (int i = 1; i < score.length; i++) {    // 이 때 값을 비교하여 answer에 값 넣음
                rank[i] = score[i];
                if (score[i] > last) {
                    answer[i] = last;
                } else {
                    answer[i] = score[i];
                    last = score[i];
                }
            }
        } else {    // score 배열의 크기가 k보다 클 때
            for (int i = 1; i < k; i++) {   // k까지 명예에 전당에 올림
                rank[i] = score[i];
                if (score[i] > last) {
                    answer[i] = last;
                } else {
                    answer[i] = score[i];
                    last = score[i];
                }
            }

            Arrays.sort(rank);  // 명예의 전당 정렬

            for(int i = k; i < score.length; i++) {     // k이후부터 명예의 전당에서 제일 낮은 값과 비교
                if(score[i] > rank[0]) {
                    rank[0] = score[i];
                    Arrays.sort(rank);
                    answer[i] = rank[0];
                }
                else {
                    answer[i] = rank[0];
                }
            }
        }

        return answer;
    }
}

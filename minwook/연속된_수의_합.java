class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        for (int i = total + num; i >= -total ;i--){ // total 이 0이고 num 값이 클 경우를 대비해 최댓값을 크게 잡음
            answer[num-1] = i; // 오름차순으로 담기 위해 뒤에서부터 삽입
            for (int j = num-1 ; j > 0; j--){ // 나머지 배열도 -1 한 뒤 삽입
                answer[j-1] = answer[j] - 1;
            }
            int sum = 0; // 합 초기화
            for (int n : answer) { // answer에 담긴 배열의 합
                sum += n;
            }
            if (sum == total) // total과 answer가 일치하면 종료
                break;
        }
        return answer;
    }
}

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1; // 칠한 횟수 기본 값으로 1

        int prev = section[0];  // 이전 구역의 끝 위치

        for (int i = 1; i < section.length; i++) {
            int gap = section[i] - prev;    // 현재 시작 위치와 이전 구역의 끝 위치 사이 계산
            if (gap >= m) { // 롤러의 길이보다 크면
                prev = section[i];  // 현재 시작 위치를 이전 구역의 끝 위치로 지정
                answer++;   // 칠한 횟수 추가
            }
        }

        return answer;
    }
}

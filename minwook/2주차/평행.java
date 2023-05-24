class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        if((checkSlopeEquality(dots, 0, 1, 2, 3)) + (checkSlopeEquality(dots, 0, 2, 1, 3)) + (checkSlopeEquality(dots, 0, 3, 1, 2)) != 0) 
            answer = 1; // 하나라도 기울기가 같은 경우 1 반환
        return answer;
    }
    
    private int checkSlopeEquality(int[][] dots, int a, int b, int c, int d) { // 기울기가 같은지 확인하는 함수
            double slope1 = (double)(dots[b][1] - dots[a][1]) / (dots[b][0] - dots[a][0]); // 기울기가 소수점일 경우를 대비하여 double로 형변환
            double slope2 = (double)(dots[d][1] - dots[c][1]) / (dots[d][0] - dots[c][0]);
        return (slope1 == slope2) ? 1 : 0; // 기울기가 같은 경우 1 아니면 0을 반환
    }
}
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        //첫번째와 두번째 좌표의 기울기와, 세번째 네번째 좌표의 기울기를 구해서 비교
        if(Inclination(dots[0], dots[1]) == Inclination(dots[2],dots[3])) {
            answer = 1;
        }
        //첫번째와, 네번째 기울기, 두번째 세번째 기울기 비교
        if(Inclination(dots[0], dots[3]) == Inclination(dots[1],dots[2])) {
            answer = 1;
        }
        //첫번째와 세번째, 두번째와 네번째 기울기 비교
        if(Inclination(dots[0], dots[2]) == Inclination(dots[1],dots[3])) {
            answer = 1;
        }
        return answer;      //기울기가 다른경우 0이기 때문에 기울기가 다른 경우는 구하지 않음
    }

    public static double Inclination(int[] dot1, int[] dot2) {  //기울기 구하는 함수 dots의 배열을 받아온다
        int dotX = (dot2[0]-dot1[0]);   //기울기를 구하기 위해서 x좌표의 차이를 구한다
        int dotY = (dot2[1]-dot1[1]);   //기울기를 구하기 위해서 y좌표의 차이를 구한다
        double inclination = (double) dotY / dotX;  //기울기의 소수점까지 구하기 위해서 double형으로 바꿔준다.
        return inclination;

    }
}
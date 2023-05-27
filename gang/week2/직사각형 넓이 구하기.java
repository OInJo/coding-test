class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int side1 = sideLength(dots[0], dots[1]);   //첫번째와 두번째 배열 비교
        int side2 = sideLength(dots[1], dots[2]);   //두번째와 세번째 배열 비교
        answer = side1 * side2; //나온 변의 길이를 곱하면 넓이가 된다.
        return answer;
    }

    public int sideLength(int[] dot1, int[] dot2) { //변의 길이를 구하는 함수
        int side = 0;
        if(dot1[0] == dot2[0]) {    //배열 두개를 비교해서 x의 값이 서로 같으면
            side = Math.abs(dot1[1]-dot2[1]);   //y축 변의 길이 구하기
        }
        else {  //반대일 경우
            side = Math.abs(dot1[0]-dot2[0]);   //x축 변의 길이 구하기
        }
        return side;
    }
}
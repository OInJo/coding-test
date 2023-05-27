class Solution {
    public int solution(int[][] dots) {
        int w = 0;
        int h = 0;
        int x = dots[0][0];     //x값의 꼭지점 좌표
        int y = dots[0][1];     //y값의 꼭지점 좌표
        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0])
                w = Math.abs(x - dots[i][0]);  //x 좌표 값이 다른 지점이 반대쪽 x좌표 값
            if (y != dots[i][1])
                h = Math.abs(y - dots[i][1]);  //y 좌표 값이 다른 지점이 반대쪽 y좌표 값
        }
        return w * h;
    }
}
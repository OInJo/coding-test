function solution(dots) {
    var x1 = dots[0][0];
    var y1 = dots[0][1];
    var x2 = dots[1][0];
    var y2 = dots[1][1];
    var x3 = dots[2][0];
    var y3 = dots[2][1];
    var x4 = dots[3][0];
    var y4 = dots[3][1];

    // 나올 수 있는 모든 기울기들 비교
    if((y2 - y1) / (x2 - x1) === (y4 - y3) / (x4 - x3) || (y3 - y1) / (x3 - x1) === (y4 - y2) / (x4 - x2) || (y3 - y2) / (x3 - x2) === (y4 - y1) / (x4 - x1)) {
        return 1; // 하나라도 맞을 시 1 리턴
    } else 
        return 0;
}
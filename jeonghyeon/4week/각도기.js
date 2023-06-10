function solution(angle) {
    if(0 < angle && angle < 90) { // 예각 표시
        return 1;
    } else if(angle === 90) { // 직각 표시
        return 2;
    } else if(90 < angle && angle < 180) { // 둔각 표시
        return 3;
    } else { // 나머지 180도 평각일 때 표시
        return 4;
    }
}
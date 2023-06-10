function solution(angle) {
    var answer = 0;
    if(angle < 90){
        answer = 1; // 90 보다 작으면 1
    } else if (angle === 90){
        answer = 2; // 90 과 같다면 2
    } else if(90 < angle  && angle < 180){
        answer = 3; // 98 보다 크고 180 보다 작으면 3
    } else  if(angle === 180){
        answer = 4; // 180 과 같으면 4
    }
    return answer;
}

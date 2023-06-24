function solution(num) {
    let answer = 0; // 몇번 반복하는지 셈
    while(num != 1) {
        if(num % 2 == 0) { // 입력된 수가 짝수
            num /= 2; // 2로 나눠진 수
        } else { // 홀수 시
            num = num * 3 + 1;
        }
        answer += 1 // 반복한 수 
    }
    if(answer >= 500) {
        return -1; // 500번 반복 후 1 안나오면 -1
    } else {
        return answer; // 아니면 반복한 수 리턴
    }
}
function solution(num) {
    var answer = 0; 
    while (num != 1) { // 1이 되기 전까지 반복
        if (num % 2 == 0) { 
            num = num / 2; 
        } else {
            num = num * 3 + 1; 
        }
        answer++; 
        if (answer > 500) { // 500보다 답의 값이 크다면 실행
            return -1; 
            break; 
        }
    }
    return answer; 
}

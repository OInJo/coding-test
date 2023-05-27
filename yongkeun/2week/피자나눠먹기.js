function solution(n) {
    const first = n; //처음 사람 수가 first에 들어감
    while(n % 6 != 0 ) { //n이 6으로 딱 나누어떨어질때까지 반복
        n+=first; //딱 안나누어떨어지면 다시 사람 수를 더함
    }
    return n / 6;
}
function solution(n) {
    let fibo = [0, 1]; // n이 2 이상이므로 0,1번째 저장
    for(let i = 2; i <= n; i++) {
        fibo[i] = (fibo[i-1] + fibo[i-2]) % 1234567;
    } // n번째 피보나치 수를 1234567로 나눈 나머지
    return fibo[n];
}
function solution(balls, share) {
    var answer = 1;
    answer = factorial(balls) / (factorial(balls - share) * factorial(share)); // 서로 다른 n개중 m개 뽑기
    return answer;
}

function factorial(n) { // 팩토리얼 함수
    let result = BigInt(1); // 큰 수도 계산 가능
    for (let i = 1; i <= n; i++) {
        result *= BigInt(i);
    }
    return result
}
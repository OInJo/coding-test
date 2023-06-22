function solution(left, right) {
    var answer = 0;
    for(let num = left; num <= right; num++) { // left부터 right까지 반복하며 숫자 나타냄
        const divisor = findDivisor(num); // 현재 숫자의 약수 구함
        if(divisor.length % 2 == 0) { // 약수의 개수가 짝수인지 판단
            answer += num; // 약수 개수가 짝수이면 현재 숫자는 더해짐
        } else {
            answer -= num; // 약수 개수가 홀수이면 현재 숫자에서 뺌
        }
    }
    return answer; // 결과 리턴
}

// 수의 약수 구하는 함수
function findDivisor(n) {
    const divisor = []; // 약수 담을 배열
    for(let i = 1; i <= n; i++) { // i부터 n까지 반복하면서 약수 찾음
        if(n % i == 0) { // n이 i로 나누어지면 i는 n의 약수
            divisor.push(i); // 약수이므로 배열에 추가
        }
    }
    return divisor; // 약수 배열 리턴
}
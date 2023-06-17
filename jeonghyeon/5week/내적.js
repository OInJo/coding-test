function solution(a, b) {
    var answer = 0;
    for (let i = 0; i < a.length; i++) { // 배열 길이만큼 반복
        answer += a[i] * b[i]; // 인덱스 i 부분을 계속 증가시키면서 곱한 후 더해준다
    }
    return answer; // 모두 더한 값 반환
}
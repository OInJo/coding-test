function solution(a, b) {
    var answer = 0;
    // 배열 a의 길이만큼 반복한다.
    for (let i = 0; i < a.length; i++){
        // a 배열과 b 배열의 해당 요소를 곱하여 answer에 더한다.
        answer += a[i]*b[i]
    }
    return answer;
}
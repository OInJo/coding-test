function solution(n) {
    var answer = '';
    for(let i = 0; i < n; i++) { // n번 반복
        if(i % 2 === 0) { // i가 짝수
            answer += "수"; // 문자열에 "수" 추가
        } else { // i가 홀수
            answer += "박"; // 문자열에 "박" 추가
        }
    }
    return answer; // n번 반복 후 결과 문자열
}
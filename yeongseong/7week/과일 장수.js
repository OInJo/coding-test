function solution(k, m, score) {
    let answer = 0;
    score.sort((a, b) => b - a); // 내림차순으로 정렬
    let boxcount = Math.floor(score.length / m); // 상자의 개수
    for (let i = 0; i < boxcount; i++) {
       answer += score[i * m + m -1] * m;
    }
    return answer;
}
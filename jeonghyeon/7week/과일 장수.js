function solution(k, m, score) {
    score.sort((a,b) => b - a); // 내림차순으로 정렬
    let boxnum = parseInt(score.length / m); // 만들 수 있는 박스 개수
    let maxprofit = 0; // 최대 이익
    for(let i = 0; i < boxnum; i++) {
        let includenum = score.slice(i * m, (i + 1) * m); // 박스에 포함 될 점수
        let minnum = Math.min(...includenum); // 현재 박스 점수들 중 가장 작은 수
        let currentbox = minnum * m; // 현재 박스 이익
        maxprofit += currentbox; // 모든 이익들 더하기
    }
    return maxprofit;
}
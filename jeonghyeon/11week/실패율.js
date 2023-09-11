function solution(N, stages) {
    let answer = []; // 결과
    let fail = []; // 스테이지 번호, 실패율 담을 배열
    for(let i = 1; i <= N; i++) {
        let reachuser = 0; // 도달
        let failuser = 0; // 실패
        for(let j = 0; j < stages.length; j++) {
            if(stages[j] >= i) reachuser++;
            if(stages[j] === i) failuser++;
        }
        let failrate = failuser / reachuser;
        fail.push([i, failrate]);
    }
    // 실패율이 큰 수부터 내림차순, 실패율 비교
    fail.sort((a,b) => b[1] - a[1]);
    // 정렬된 fail의 [0] 떼옴
    for(let k = 0; k < fail.length; k++) { // fail돌면서 스테이지 번호만 가져옴
        answer.push(fail[k][0]);
    }
    return answer;
}
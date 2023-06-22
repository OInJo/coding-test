function solution(d, budget) {
    var answer = 0;
    // 오름차순 정렬
    d.sort((a, b) => a - b);
    for (let i = 0; i < d.length; i++){
        // 예산이 현재 요소보다 크거나 같은 경우
        if (budget >= d[i]){
            // 현재 요소를 예산에서 빼기
            budget -= d[i];
            // 결과 카운터 증가
            answer++
        }else {
            break;
        }
    }
    return answer;
}
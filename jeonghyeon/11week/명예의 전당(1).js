function solution(k, score) {
    var answer = []; // 결과
    var num = []; // 명예의 전당 들어있는 점수들
    for(let i = 0 ; i < score.length ; i ++) {
        if(i < k) {
            num.push(score[i]);
        }
        if(score[i]>Math.min(...num)) {
            num.pop(); // 제일 작은 수 빼기
            num.push(score[i]);
            num.sort((a,b) => b-a); // 내림차순 작은게 제일 뒤
        }
        answer.push(num.at(-1));
    }
    return answer;
}
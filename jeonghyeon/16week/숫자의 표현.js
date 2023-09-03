function solution(n) {
    var answer = 0;
    for(let i = 1; i <= n; i++) {
        let sum = i; // 현재 더해진 수
        for(let j = i + 1; sum < n; j++) {
            sum += j; // 연속된 수 더해감
        }
        if(sum === n) {
            answer++; // n과 같은 수가 되면 증가
        }
    }
    return answer;
}
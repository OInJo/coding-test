function solution(sides) {
    let answer = 0;
    const x = Math.max(...sides); // 배열에서 큰 수 x
    const y = Math.min(...sides); // 배열에서 작은 수 y
    
    // 배열에 가장 긴 변이 있다
    for(let i = x - y + 1; i <= x; i++) { // i는 x와 같거나 더 작은 수이다
        answer++;
    }
    
    // 배열에 없는 수가 가장 긴 변
    for(let i = x + 1; i < x + y; i++) {
        answer++;
    }
    
    return answer;
}
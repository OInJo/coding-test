function solution(seoul) {
    for(let i = 0; i < seoul.length; i++) { // seoul 돌면서 Kim 찾음
        if(seoul[i] === "Kim") {
            return `김서방은 ${i}에 있다`;
        }
    }
}
function solution(s){
    let count = 0; // ( 횟수
    let answer = true;
    for(let i = 0; i < s.length; i++) {
        if(s[i] === '(') { 
            count++; // '(' 나오면 증가
        } else if(s[i] === ')') {
            count--; // ')' 나와서 짝 맞으면 삭제
        } 
        if(count < 0) {
            answer = false; // ')' 수가 많아짐 올바른 괄호 X
        }
    }
    if(count > 0) answer = false; // count에 ( 남아있음
    return answer;
}
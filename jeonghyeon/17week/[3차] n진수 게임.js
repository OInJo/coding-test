function solution(n, t, m, p) {
    let answer = '';
    let numString = ''; 
    for(let i = 0; i < t*m; i++) { // 연속된 숫자 
        numString += i.toString(n).toUpperCase();
    }
    
    for(let j = p-1; j < t*m; j += m) {
        answer += numString[j];
    } // 순서 p에 맞는 문자 뽑음
    return answer;
}
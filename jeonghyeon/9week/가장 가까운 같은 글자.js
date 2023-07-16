function solution(s) {
    let answer = [];
    let check = []; // 나온 알파벳 저장
    
    for(let i = 0; i < s.length; i++) {
        if(!check.includes(s[i])) { // 같은 알파벳이 이미 나오지 않았다면
            answer.push(-1); // -1
            check.push(s[i]); // 나왔다고 표시
        } else if(check.includes(s[i])) { // 이미 있다
            answer.push(i - check.lastIndexOf(s[i])); // 현재 위치 i와 이전에 나온 같은 문자의 가장 최근 위치 차이
            check.push(s[i]);
        }
    }
    return answer;
}
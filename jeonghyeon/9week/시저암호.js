function solution(s, n) {
    let answer = "";
    for(let i = 0; i < s.length; i++) {
        let code = s[i].charCodeAt(); // 문자->아스키코드
        let changecode;
        if(s[i] === " ") { // 공백
            answer += " "; // 공백 추가
            
        } else if(s[i] >= "a" && s[i] <= "z") { // 소문자
            changecode = (code - 97 + n) % 26 + 97;
            answer += String.fromCharCode(changecode);
        } else if(s[i] >= "A" && s[i] <= "Z") { // 대문자
            changecode = (code - 65 + n) % 26 + 65;
            answer += String.fromCharCode(changecode); // 코드 -> 문자열
        }
    }
    return answer;
}

// 문자열 -> 아스키코드 : s.charCodeAt()
// 반대 : String.fromCharCode()
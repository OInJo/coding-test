function solution(s) {
    if(s.length !== 4 && s.length !== 6) {
        // 길이가 4나 6이 아니면 false
        return false;
    }
    for(let i = 0; i < s.length; i++) {
        if(isNaN(s[i])) { // 문자열에 숫자가 있나 확인 Not a Number
            return false;
        }
    }
    return true;
}
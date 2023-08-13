function solution(s, skip, index) {
    let answer = '';
    let schar = s.split(''); // 문자열 문자로 만들어 배열 변환
    for(let i = 0; i < schar.length; i++) {
        let code = schar[i].charCodeAt(); // 모두 아스키코드로 변환
        for(let j = 1; j <= index; j++) {
            code++;
            if(code > 122) {
            code = (code - 122) + 96;
            }
            if(skip.includes(String.fromCharCode(code))) {
                j--; // skip에 해당하는 문자면 j 감소해 한번더 더해줌
            }
        }
        answer += String.fromCharCode(code); // 아스키코드에서 문자로 다시 바꿈
    }
    return answer;
}
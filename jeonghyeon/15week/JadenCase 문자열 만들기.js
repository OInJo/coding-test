function solution(s) {
    let eachword = s.split(" "); // 공백 기준으로 문자 나누기
    for(let i = 0; i < eachword.length; i++) {
        if(eachword[i] !== "") {
            eachword[i] = eachword[i][0].toUpperCase() + eachword[i].substr(1).toLowerCase(); // 첫 글자는 대문자로 첫글자 제외 나머지는 소문자로 표시
        }
    }
    return eachword.join(" "); // 나눈 문자 다시 합
}
function solution(s) {
    const word = s.split(" "); // 공백을 기준으로 문자열 나눠 배열 반환
    let convert  = []; // 결과 문자열
    
    for(let i = 0; i < word.length; i++) {
        let upperlower = ""; // 변환된 단어 저장
        for(let j = 0; j < word[i].length; j++) {
            if(j % 2 == 0) {
                upperlower += word[i][j].toUpperCase(); // 짝수번째는 대문자로 변환
            } else {
                upperlower += word[i][j].toLowerCase(); // 홀수번째는 소문자로 변환
            }
        }
        convert.push(upperlower); // 변환 단어 배열에 추가
    }
    return convert.join(" "); // 각 단어를 공백으로 구분해 문자열로 리턴
}
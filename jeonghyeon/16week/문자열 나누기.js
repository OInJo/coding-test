function solution(s) {
    let answer = 0;
    let first = 0; // 현재 문자 개수
    let next = 0; // 다른 문자 개수
    let current = ""; // 현재 문자열
    for(let i = 0; i < s.length; i++) {
        if(current === "") { // 공백이면
            current = s[i]; // 현재 문자를 저장
            first++;
        } else if(s[i] === current) { // 현재 본 글자와 저장된 문자열이 같다면 
            first++;
        } else next++; // 다르면 다른 문자 개수 증가
        
        if(first === next) { // 현재 문자와 다른 문자 개수가 같아지면 
            answer++; 
            current = "";
            first = 0;
            next = 0; // 초기화
        }
    }
    if(current !== "") { // 공백으로 s가 끝나지 않았을 때
        answer++;
    }
    return answer;
}

// 처음 나온 문자랑 다른 문자들은 다른 문자의 개수를 증가 aaabbacc 는 aaaa 4개와 그 외 4개로 이루어짐
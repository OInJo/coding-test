function solution(dartResult) {
    var answer = 0; // 결과
    var score = 0; // 현재 점수, 1S면 1 저장
    var scores = []; // 각 기회 점수 저장, 1S점수 저장
    
    // dartResult[i]가 숫자일 때, 문자일 때 나누기
    for(let i = 0; i < dartResult.length; i++) {
        // 숫자일 때
        if(dartResult[i] >= 0 && dartResult[i] <= 9) {
            // 10일 때
            if(dartResult[i] === "1" && dartResult[i + 1] === "0") {
                score = 10;
                i++; // 0 건너뜀
            } else { // 10 아닐 경우엔 숫자 그대로 넣음
                score = dartResult[i];
            }
        }
        
        // 문자일 때
        else if(dartResult[i] === "S") { // 1제곱
            scores.push(Math.pow(score, 1));
        } else if(dartResult[i] === "D") { // 2제곱
            scores.push(Math.pow(score, 2));
        } else if(dartResult[i] === "T") { // 3제곱
            scores.push(Math.pow(score, 3));
        } 
        
        // * 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다
        else if(dartResult[i] === "*") {
            scores[scores.length - 1] *= 2; 
            scores[scores.length - 2] *= 2;
        } 
        else if(dartResult[i] === "#") { // 아차상(#) 당첨 시 해당 점수는 마이너스
            scores[scores.length - 1] *= -1;
        }
    }
    for(let i = 0; i < scores.length; i++) {
        answer += scores[i]; // 각 점수들 합
    }
    return answer;
}
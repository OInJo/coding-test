function solution(quiz) {
    var answer = [];
    for(let i = 0; i < quiz.length; i++) {
        let equation = quiz[i].split(" ");
        let n1 = Number(equation[0]);
        let operator = equation[1]; // 연산자
        let n2 = Number(equation[2]);
        let result = Number(equation[4]); // 결괏값
        let calc;

        if (operator == '+') {
            calc = n1 + n2;
        } else if (operator == '-') {
            calc = n1 - n2;
        } else if (operator == '*') {
            calc = n1 * n2;
        } else if (operator == '/') {
            calc = n1 / n2;
        }
        
        if (calc == result) { // 계산결과 == 답
            answer.push('O');
        } else {
            answer.push('X');
        }
    }
    return answer;
}
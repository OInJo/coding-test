function solution(answers) {
    const check1 = [1, 2, 3, 4, 5];
    const check2 = [2, 1, 2, 3, 2, 4, 2, 5];
    const check3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    const score = [0, 0, 0]; // 각 점수
    const maxstudent = []; // 가장 많이 맞힌 사람
    
    for(let i = 0; i < answers.length; i++) {
        if(answers[i] === check1[i % check1.length]) {
            score[0]++;
        }
        if(answers[i] === check2[i % check2.length]) {
            score[1]++;
        }
        if(answers[i] === check3[i % check3.length]) {
            score[2]++;
        }
    }
    const max = Math.max(...score); // 가장 큰 점수 
    for(let j = 0; j < score.length; j++) {
        if(score[j] === max) { // 가장 큰 점수랑 같은 사람 찾기
            maxstudent.push(j + 1);
        }
    }
    return maxstudent;
}
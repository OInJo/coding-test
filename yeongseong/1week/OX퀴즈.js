function solution(quiz) {
    const answer = [];
    
    for (let i = 0; i < quiz.length; i++) {
      const [x, operator, y, _, z] = quiz[i].split(" ");
      
      if (operator === "+") {
        answer[i] = parseInt(x) + parseInt(y) === parseInt(z) ? "O" : "X";
      } else if (operator === "-") {
        answer[i] = parseInt(x) - parseInt(y) === parseInt(z) ? "O" : "X";
      }
    }
    
    return answer;
  }
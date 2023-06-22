function solution(n) {
    var answer = ''; 
    // 1부터 n까지 반복
    for (let i = 1; i <= n; i++) {
      if (i % 2 === 0) {
        // i가 짝수인 경우 "박"을 추가
        answer += "박";
      } else {
        // i가 홀수인 경우 "수"를 추가
        answer += "수";
      }
    }
    return answer;
  }
  
  
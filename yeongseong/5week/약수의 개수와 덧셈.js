function solution(left, right) {
    var answer = 0;
    for (let i = left; i <= right; i++) {
      let count = 0; 
      for (let j = 1; j <= i; j++) {
        if (i % j === 0) { // 현재 숫자를 j로 나누어 약수인지 확인
          count += 1; // 약수이면 count 증가
        }
      }
      if (count % 2 === 0) { // 약수 개수가 짝수인 경우
        answer += i; // 현재 숫자를 더함
      } else { // 약수 개수가 홀수인 경우
        answer -= i; // 현재 숫자를 뺌
      }
    }
    return answer; 
  }
  
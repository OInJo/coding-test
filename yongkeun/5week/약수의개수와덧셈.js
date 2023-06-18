function solution(left, right) {
  var answer = 0;
  for (left; left <= right; left++) {
    let divisorCount = 0; //약수의 개수를 카운팅할 변수
    for (let i = 1; i <= left; i++) {
      if (left % i == 0) divisorCount++; //약수라면 약수의 개수를 +1
    }
    if (divisorCount % 2 == 0)
      answer += left; //약수의 개수가 짝수면 값을 더하고
    else answer -= left; //아니면 값을 뺌
  }
  return answer;
}

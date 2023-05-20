function solution(n) {
  var answer = 0;
  if (n % 2 == 1) {
    //홀수라면
    for (let i = 1; i <= n; i += 2) {
      //반복문을 실행하는데 홀수만 더할것이므로 1부터 2씩 더함
      answer += i; //들어온 홀수를 answer에 더함
    }
  } else {
    //짝수라면
    for (let i = 2; i <= n; i += 2) {
      //똑같이 2부터 짝수만 추출
      answer += i * i; //들어온 짝수를 제곱하여 answer에 더함
    }
  }
  return answer;
}

function solution(n) {
  var answer = [];
  for (let i = 1; i <= n; i++) {
    //i를 1부터 n까지 반복문 실행
    if (n % i == 0) {
      //n과 i를 나눴을 때 나머지가 0이면 약수이다. 그럴때 if문 실행
      answer.push(i); //약수라면 answer이라는 배열에 넣음
    }
  }
  return answer;
}

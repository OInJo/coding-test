function solution(num) {
  var answer = 0;
  while (num !== 1) {
    //num이 1이 될 때까지 반복
    if (num % 2 === 0) {
      //짝수라면
      num /= 2;
    } else if (num % 2 === 1) {
      //홀수라면
      num = num * 3 + 1;
    }
    answer++;
  }
  return answer < 500 ? answer : -1; //answer이 500 이하면 answer을 return, 아니면 -1을 return
}

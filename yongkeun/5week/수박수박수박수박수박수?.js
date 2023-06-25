function solution(n) {
  var answer = "";
  for (let i = 0; i < n; i++) {
    if (i % 2) answer += "박"; //홀수면 박을 더함
    else answer += "수"; //짝수면 수를 더함
  }
  return answer;
}

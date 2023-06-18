function solution(n) {
  let answer = 0;
  String(n)
    .split("")
    .forEach((value) => (answer += Number(value))); //n을 문자열로 바꾼 후 split을 이용해 하나하나 분리하고, 다시 숫자로 바꾼 후 answer에 더함
  return answer;
}

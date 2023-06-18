function solution(a, b) {
  var answer = 0;
  for (let i = 0; i < a.length; i++) {
    //a, b의 길이가 같으므로 아무거나 길이만큼 돌음
    answer += a[i] * b[i]; //곱해서 나온 값을 answer에 계속 더함
  }
  return answer;
}

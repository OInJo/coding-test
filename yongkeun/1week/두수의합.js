function solution(a, b) {
  var answer = String(BigInt(a) + BigInt(b)); //a, b를 Number로 변환하면 숫자가 너무 커서 뒤에가 짤림. 그러므로 더 큰 숫자를 담을 수 있는 BigInt를 이용하여 연산 후, String으로 바꿔서 answer에 할당
  return answer;
}

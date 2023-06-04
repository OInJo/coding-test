function solution(num_list) {
  let even = 0; //짝수
  let odd = 0; //홀수
  num_list.forEach((value) => {
    if (value % 2 == 0) {
      //짝수면
      even++; //짝수더하기
    } else if (value % 2 == 1) {
      odd++;
    }
  });
  return [even, odd];
}

function solution(numbers) {
  const zeroToNine = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
  let answer = 0;
  for (let i = 0; i < zeroToNine.length; i++) {
    if (!numbers.includes(zeroToNine[i])) {
      //numbers 배열에 0이 없는지, 1이 없는지,
      answer += zeroToNine[i]; //없으면 더하기
    }
  }
  return answer;
}

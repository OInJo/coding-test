function solution(array, n) {
  var answer = 0;
  array.forEach((value) => {
    //array 배열을 돌며,
    if (value === n) {
      //값이 같으면
      answer++; //더하기
    }
  });
  return answer;
}

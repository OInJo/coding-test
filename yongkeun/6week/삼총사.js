function solution(number) {
  var answer = 0;
  for (let i = 0; i < number.length; i++) {
    for (let j = i + 1; j < number.length; j++) {
      for (let k = j + 1; k < number.length; k++) {
        //012 013 014 023 024 034 123, 124, 134, 234
        //i, j, k를 모두 0부터 시작했더니 0, 1, 2를 더해서 0이 나오고, 0, 2, 1에도 접근해서 0이 나오므로 원하는대로 해결되지 않는 문제 발견, 그래서 j=i+1, k=j+1로 변경하여 해결
        if (number[i] + number[j] + number[k] === 0) {
          //값을 더해서 0이면
          console.log(i, j, k);
          answer++;
        }
      }
    }
  }
  return answer;
}

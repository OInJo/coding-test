function solution(d, budget) {
  d.sort((a, b) => a - b); //오름차순
  var answer = 0;
  d.forEach((value) => {
    if (budget - value >= 0) {
      //0 이상이면
      budget -= value;
      answer++;
    }
  });
  return answer;
}

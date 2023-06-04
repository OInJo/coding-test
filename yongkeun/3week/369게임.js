function solution(order) {
  var answer = 0;
  var order = String(order).split(""); //29423을 2 9 4 2 3 으로 출력하기 위해 split을 이용해 분리
  order.forEach((value) => {
    if (value == 3 || value == 6 || value == 9) {
      //들어온 값이 3이거나 6이거나 9면
      answer++; //answer 증가
    }
  });
  return answer;
}

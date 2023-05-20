function solution(quiz) {
  var answer = [];
  quiz.forEach(function (element) {
    //quiz라는 배열을 하나씩 접근함
    element = element.split(" = "); //접근한 배열은 element인데 " = "로 나눠서 2개로 만듬. 하나는 수식이고 하나는 답이 될거임
    if (eval(element[0]) == element[1]) {
      //수식의 결과를 eval로 구하고, 수식의 답과 같다면 O
      answer.push("O");
    } else {
      //아니면 X
      answer.push("X");
    }
  });
  return answer;
}

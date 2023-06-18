function solution(emergency) {
  var answer = [];
  const oldEmergency = [...emergency]; //원본배열을 oldEmergency에 담아놓음 [...]을 쓰지 않으면 emergency를 바꾸면 oldEmergency도 바뀜. 그런 상황을 원하지 않으므로 [...]을 사용
  emergency.sort(function (a, b) {
    //내림차순정렬
    return b - a;
  });
  for (let i = 0; i < emergency.length; i++) {
    //돌면서
    answer.push(emergency.indexOf(oldEmergency[i]) + 1); //정렬된 배열의 값을 원본배열에서 찾아서 인덱스값을 출력하는데 몇 번째 순서인지 출력하므로 +1 함
  }
  return answer;
}

function solution(chicken) {
  var answer = 0;
  while (10 <= chicken) { //치킨의 갯수가 10을 넘지 않아서 더이상 서비스 치킨을 받을 수 없을때까지 반복
    order = parseInt(chicken / 10); // 10으로 나눈 값의 목을 order에 넣음, 1차적으로 서비스 치킨을 몇개 받았는지 order에 들어감
    chicken = chicken % 10; // 10으로 나눈 값의 나머지를 chicken에 넣음, 이제 서비스 치킨을 다 시키고 chicken개의 쿠폰이 남은거임
    answer += order; //서비스 치킨을 몇개 시켰는지 answer에 더해줌
    chicken += order; //그럼 내가 치킨 시킨은 평소에 치킨 시킨(ex:100) + 서비스로 받은 치킨(ex:10)이므로 110마리가 됨. 거기서 다시 서비스 개수 계산
  }
  return answer;
}

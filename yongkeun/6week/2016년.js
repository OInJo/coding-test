function solution(a, b) {
  //1월 31일
  //2월 29일
  //3월 31일
  //4월 30일
  //5월 31일
  //6월 30일
  //7월 31일
  //8월 31일
  //9월 30일
  //10월 31일
  //11월 30일
  //12월 31일
  const day = ["FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"]; //1월1일은 금요일이므로 FRI부터 배열에 담기 시작
  var answer = 0;
  for (let i = 1; i < a; i++) {
    //5월이면 1,2,3,4를 반복
    //switch case문을 이용해 무슨 달을 지났는지 check하고 그 해당 달의 일수만큼 더함
    switch (i) {
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        answer += 31;
        break;
      case 1: //1월은 31일까지 있지만, 1월1일부터 시작하므로 30일만 더하면 됨
      case 4:
      case 6:
      case 9:
      case 11:
        answer += 30;
        break;
      case 2:
        answer += 29;
        break;
    }
  }
  if (a === 1) {
    //만약에 1월이라면 1월1일부터 시작하므로 -1을 뺌
    b -= 1;
  }
  answer += b; //이제 월에서 며칠이 지났는지 계산한 값과, 현재 일(b)를 더함
  return day[answer % 7]; //값을 7로 나눈 나머지 값이 day의 index임
}

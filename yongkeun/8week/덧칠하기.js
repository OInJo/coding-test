function solution(n, m, section) {
  last = 0; //현재까지 칠해진 구간
  count = 0;
  section.forEach((value) => {
    //section 배열을 방문하면서
    if (value > last) {
      //현재 값이 last보다 크면(롤러질이 우측 끝을 벗어나지 않는다면)
      last = value + m - 1; //last는 현재값+롤러값-1이 됨, -1의 이유는 last가 3이면 3까지는 칠해져있다는 의미이므로 4부터 시작되야하기 때문
      count++;
    }
  });
  return count;
}

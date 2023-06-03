function solution(str1, str2) {
  //includes는 문자열 안에 포함하는지 확인하는 메소드이다.
  //str2 문자열이 str1안에 포함되어있다면 true를 반환한다.
  if(str1.includes(str2)){
      return 1;
  }
  else {
      return 2;
  }
}
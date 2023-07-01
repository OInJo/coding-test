function solution(price, money, count) {
  for (let i = 1; i <= count; i++) {
    //1to4
    money -= price * i; //몇 번째 탑승인지 계산하고 몇 번째 만큼 곱하여 money에서 뺌
  }
  if (money < 0) {
    //만약 0보다 작으면
    return -money; //money를 -하여 +로 리턴
  } else {
    return 0; //돈이 안부족하면 0 리턴
  }
}

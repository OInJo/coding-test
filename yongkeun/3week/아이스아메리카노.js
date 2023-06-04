function solution(money) {
  return [parseInt(money/5500), money%5500] //배열의 첫번째에는 5500을 나눈 정수 값을 넣고, 두번째에는 아메리카노 가격5500의 나머지를 넣는다
}
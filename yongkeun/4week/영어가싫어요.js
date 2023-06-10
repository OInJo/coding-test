function solution(numbers) {
  let number = [
    "zero",
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
  ]; //배열의 index를 result 값에 추가
  // .replace(SearchValue, NewValue) : SearchValue를 찾아 NewValue로 바꿔줌
  for (let i = 0; i < 8; i++) {
    //for문으로 한번 더 감싸주지 않으면 "twozerozero" 같은 zero가 여러번 나오는 경우에는 가장 처음 zero만 0으로 바뀌므로 for문 한번 더 씀
    number.forEach((value, index) => {
      numbers = numbers.replace(value, index);
    });
  }
  return Number(numbers);
}

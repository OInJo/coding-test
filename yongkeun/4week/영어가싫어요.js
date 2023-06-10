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
  number.forEach((value, index) => {
    numbers = numbers.replaceAll(value, index);
  });
  return Number(numbers);
}

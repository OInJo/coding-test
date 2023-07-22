function solution(s) {
  numberAlphabet = [
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
  ];
  for (let i = 0; i < numberAlphabet.length; i++) {
    s = s.replaceAll(numberAlphabet[i], i);
  }
  return parseInt(s);
}

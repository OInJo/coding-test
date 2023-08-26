function solution(s) {
  let count = 0; //몇 번의 이진 변환을 했는지?
  let zeroCount = 0; //0을 몇개 제거했는지?
  while (s !== "1") {
    zeroCount += s.replaceAll("1", "").length; //1을 다 제거하고 그 길이를 zeroCount에 더함
    s = s.replaceAll("0", ""); // 0을 다 제거
    s = s.length.toString(2); // 2진수로 변경
    count++;
  }
  return [count, zeroCount];
}

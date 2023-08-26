function solution(s) {
  // (면 배열에 넣고, )면 배열에서 제거하는 방식을 반복
  // )가 들어왔는데 배열에 아무것도 없으면 false
  // 마지막에 stack.length가 0이 아니여도 false(stack에 (이 남아있는 경우 false)
  let stack = [];
  for (let i = 0; i < s.length; i++) {
    if (s[i] === "(") {
      stack.push(1);
    } else if (s[i] === ")") {
      if (stack.length > 0) {
        stack.pop();
      } else {
        return false;
      }
    }
  }
  return stack.length === 0 ? true : false;
}

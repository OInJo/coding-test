function solution(s) {
  //baabaa 라고 가정할 때
  //stack 에 b가 박히고, a가 들어옴.
  //stack 에 ba가 박히고, a가 들어옴.
  //stack 마지막 a와 들어온 a가 같으므로 stack 마지막을 제거
  let stack = [];
  for (let i = 0; i < s.length; i++) {
    if (stack[stack.length - 1] === s[i]) {
      stack.pop();
    } else {
      stack.push(s[i]);
    }
  }
  return stack.length === 0 ? 1 : 0;
}

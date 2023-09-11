function solution(numbers) {
  const answer = new Array(numbers.length).fill(-1);
  const stack = [];
  for (let i = 0; i < numbers.length; i++) {
    while (numbers[i] > numbers[stack[stack.length - 1]]) {
      const idx = stack.pop();
      answer[idx] = numbers[i];
    }
    stack.push(i);
  }
  return answer;
}

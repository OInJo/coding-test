function solution(numbers) {
    var answer = [];
    var number = 0;
    for (let i = 0; i < numbers.length; i++) {
      for (let j = i + 1; j < numbers.length; j++) { // i + 1로해서 중복을 피함
        number = numbers[i] + numbers[j];
        if (!answer.includes(number)) {
          answer.push(number);
        }
      }
    }
    answer.sort((a, b) => a - b);
    return answer;
  }
  
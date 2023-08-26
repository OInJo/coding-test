function solution(number, limit, power) {
  // 에라토스테네스의 체를 활용하여 각 숫자마다 약수의 개수를 미리 계산
  let divisorsCount = new Array(number + 1).fill(0);
  for (let i = 1; i <= number; i++) {
    for (let j = i; j <= number; j += i) {
      divisorsCount[j]++;
    }
  }

  // 약수의 개수가 limit보다 크다면 power로 변경
  for (let i = 1; i <= number; i++) {
    if (divisorsCount[i] > limit) {
      divisorsCount[i] = power;
    }
  }

  // divisorsCount 배열의 값들을 더하여 결과를 반환
  return divisorsCount.reduce(
    (accumulator, currentValue) => accumulator + currentValue,
    0
  );
}

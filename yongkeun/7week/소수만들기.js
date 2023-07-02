function solution(nums) {
  let primeNumberCount = 0;
  for (let i = 0; i < nums.length; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      for (let k = j + 1; k < nums.length; k++) {
        let divisorCount = 0; //약수의 개수를 체크할 변수
        for (let n = 1; n <= nums[i] + nums[j] + nums[k]; n++) { //이번에 들어온 숫자만큼 반복
          if ((nums[i] + nums[j] + nums[k]) % n == 0) { //약수인지 체크
            divisorCount++; //약수의 개수를 더함
          }
        }
        if (divisorCount == 2) { //약수의 개수가 2개면(1과 나 자신) 소수이므로
          primeNumberCount++; //소수의 개수를 더함
        }
      }
    }
  }
  return primeNumberCount;
}

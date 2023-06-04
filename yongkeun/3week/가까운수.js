function solution(array, n) {
  // 하나씩 방문하여 절대값을 비교함, 만약 절대값과 result 값이 같다면 작은 값을 result에 넣음
  // 만약 새로 들어온 절대값이 더 작다면 result을 바꿈
  let result = array[0]; //첫번째 값을 result에 넣고 시작
  for (let i = 1; i < array.length; i++) {
    if (Math.abs(result - n) == Math.abs(array[i] - n)) {
      //1번째 방의 절대값과 result가 같다면
      result = Math.min(result, array[i]); //두개중에 작은 값을 result에 넣음
    } else if (Math.abs(result - n) > Math.abs(array[i] - n)) {
      //같진 않았고, 이번 절대값이 더 작으면
      result = array[i]; //이번 인덱스의 값을 result로 바꿈
    }
  }
  return result;
}

function solution(arr1, arr2) {
  var answer = [];
  for (let i = 0; i < arr1.length; i++) {
    answer[i] = []; //i번째 방의 배열을 초기화
    for (let j = 0; j < arr1[i].length; j++) {
      answer[i][j] = arr1[i][j] + arr2[i][j]; // arr1의 00과 arr2의 00을 더하여 answer00에 넣기
    }
  }
  return answer;
}

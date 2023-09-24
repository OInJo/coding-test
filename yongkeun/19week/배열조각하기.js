function solution(arr, query) {
  for (let i = 0; i < query.length; i++) {
    if (i % 2 === 1) {
      // 홀수
      // arr에서 i부터 맨 뒤까지 모두 가져오기
      arr = arr.slice(query[i]);
    } else if (i % 2 === 0) {
      // arr에서 맨 앞부터 i까지 모두 가져오기
      arr = arr.slice(0, query[i] + 1);
    }
  }
  return arr;
}

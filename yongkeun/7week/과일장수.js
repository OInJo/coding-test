function solution(k, m, score) {
  let result = 0;
  //정렬하고 m이 3이면 012 345 678 각 배열의 최소값을 다 더하기
  score = score.sort((a, b) => b - a); //정렬
  for (let i = 0; i < score.length; i += m) {
    //i가 score의 길이만큼 돌고, m만큼 더함
    appleBox = [];
    for (let j = i; j < m + i; j++) {
      //j는 i부터 시작하고, m+i까지 돌아감, 012 345
      appleBox.push(score[j]);
    }
    appleBox = appleBox.filter((element) => element !== undefined); //undefined가 있으면 잘못되므로 appleBox에 undefined 삭제
    if (appleBox.length == m) {
      //상자에 사과가 꽉 찼다면
      result += Math.min.apply(null, appleBox) * m; //최소값과 m을 곱함
    }
  }
  return result;
}

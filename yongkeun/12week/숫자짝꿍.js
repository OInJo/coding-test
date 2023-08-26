function solution(X, Y) {
  const xCount = new Array(10).fill(0); // 0부터 9까지의 숫자 카운팅 배열
  const yCount = new Array(10).fill(0);

  for (let i = 0; i < X.length; i++) {
    xCount[parseInt(X[i])]++; // 문자열을 숫자로 변환하여 해당 인덱스의 값을 증가
  }

  for (let i = 0; i < Y.length; i++) {
    yCount[parseInt(Y[i])]++;
  }

  let array = [];

  // 공통된 숫자를 찾아 array 배열에 추가
  for (let i = 0; i < 10; i++) {
    const commonCount = Math.min(xCount[i], yCount[i]);
    for (let j = 0; j < commonCount; j++) {
      array.push(i);
    }
  }

  array.sort((a, b) => b - a);

  if (array[0] === 0) return "0";
  return array.length === 0 ? "-1" : array.join("");
}

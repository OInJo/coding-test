function solution(k, tangerine) {
  tangerine.sort((a, b) => a - b); //오름차순
  let tangerineObject = {}; //귤의 크기별 갯수를 넣는 오브젝트
  let tangerineCount = 0; //귤이 몇 개가 들어갔는지를 저장, k와 비교할 때 사용
  let result = 0; //귤이 몇 종류 들어갔는지를 저장
  for (let i = 0; i < tangerine.length; i++) {
    if (tangerineObject[tangerine[i]] === undefined) {
      tangerineObject[tangerine[i]] = 1;
    } else {
      tangerineObject[tangerine[i]]++;
    }
  }
  // 현재 tangerineObject에는 "1":3, "2":4 이런 식의 key value 형식으로 저장되어있음.
  // 이러한 Object의 value값만 내림차순 정렬
  const sortedValues = Object.values(tangerineObject).sort((a, b) => b - a);
  for (let j = 0; j < sortedValues.length; j++) {
    result++;
    //귤이 몇 개가 들어갔는지를 보고, 알맞게 들어갔으면 return
    tangerineCount += sortedValues[j];
    if (tangerineCount >= k) return result;
  }
}

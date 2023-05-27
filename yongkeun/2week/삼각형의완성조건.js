function solution(sides) {
  let answer = 0;
  let min = Math.min(...sides); //최솟값
  let max = Math.max(...sides); //최댓값
  for(let i=0; i<=max; i++){ //가장 긴 변이 이미 배열에 있을 경우
      if(max<i+min){ //가장 긴 변의 길이(max)가 다른 두 변의 길이의 합(i+min)보다 작으면
          answer++ //1더하기
      }
  }
  //이제부터는 나머지 한 변이 가장 긴 변일 경우 계산
  //나머지 한 변이 가장 긴 변인 경우에는 나머지 한 변이 max보다 커야되고, min+max보다는 작아야함
  for(let j=0; j<min+max; j++){ //min+max보다 작으면서
      if(j>max){ //max보다 큰지 체크
          answer++ //1더하기
      }
  }
  return answer;
}
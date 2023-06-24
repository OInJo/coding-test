function solution(arr) {
  var answer = [];
  let a = arr[0];
  answer.push(a); //0번 index는 그냥 넣어줌
  for (let i = 1; i < arr.length; i++) {
    if (a === arr[i]) {
      //값이 같으면
      a = arr[i]; //a에 값을 할당, 이전 값이 a에 들어가서 이전 값과 현재 값을 비교하게 됨
    } else {
      //값이 같지 않으면
      answer.push(arr[i]); //push
      a = arr[i]; //이전 값을 넣어줌
    }
  }
  return answer;
}

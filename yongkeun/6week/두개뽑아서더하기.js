function solution(numbers) {
  //다 더하고, 중복 제거하고, 정렬
  var answer = [];
  for (let i = 0; i < numbers.length; i++) {
    //모든 index를 돌음
    for (let j = 0; j < numbers.length; j++) {
      if (i !== j) {
        //혹시 i 와 j가 같다면 더하면 안됨, 0번 인덱스에 있는 2와 0번 인덱스에 있는 2를 더하는 것은 하지 않으므로 if문으로 같지 않을 때만 더하도록
        answer.push(numbers[i] + numbers[j]); //더한 값을 answer에 push
      }
    }
  }
  answer = [...new Set(answer)].sort((a, b) => a - b); //더한 모든 값이 answer에 있을텐데 그 값을 new Set을 이용해 중복을 제거해주고 sort를 이용해 오름차순으로 정렬함
  return answer;
}

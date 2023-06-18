function solution(array, commands) {
  var answer = [];
  for (let i = 0; i < commands.length; i++) {
    //commands 만큼 반복
    a = array.slice(commands[i][0] - 1, commands[i][1]).sort((a, b) => a - b); //2번째부터 5번째까지라고 문제지에 적혀있는데 4번째이므로 index값 1~4을 짤라야 함 자르기 위해 slice를 이용해 자르고, 오름차순 정렬까지 한번에 하여 a라는 변수에 할당
    answer.push(a[commands[i][2] - 1]); //배열에 push하는데 세 번째 숫자를 뽑아낼때 index는 2인 숫자를 뽑아내므로 -1
  }
  return answer;
}

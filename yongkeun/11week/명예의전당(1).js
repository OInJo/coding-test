function solution(k, score) {
  let answer = [];
  let hallOfFame = [];
  for (let i = 0; i < score.length; i++) {
    hallOfFame.push(score[i]); //그냥 push하고
    hallOfFame.sort((a, b) => b - a); //내림차순으로 정렬
    if (hallOfFame.length > k) {
      //명예의전당 자리가 꽉 찼으면
      hallOfFame.pop(); //맨 뒤에 값을 제거함, 내림차순 정렬이므로 가장 작은 값이 삭제됨
    }
    answer.push(Math.min(...hallOfFame)); //그리고 명예의전당 값에 가장 낮은 값을 push함
  }
  return answer;
}

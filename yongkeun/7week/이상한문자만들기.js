function solution(s) {
  let result = "";
  word = s.split(" ");
  for (let i = 0; i < word.length; i++) {
    //단어마다 돌고
    for (let j = 0; j < word[i].length; j++) {
      //단어의 알파벳마다 돌음
      if (j % 2 == 1) {
        //홀수면
        result += word[i][j].toLowerCase(); //소문자로
      } else if (j % 2 == 0) {
        //짝수면
        result += word[i][j].toUpperCase(); //대문자로
      }
    }
    if (!(i == word.length - 1)) {
      //하나의 단어를 대소문자로 변환했으면 띄어쓰기를 넣어야 하는데 마지막 단어에서는 띄어쓰기를 하지 않음
      result += " ";
    }
  }
  return result;
}

function solution(food) {
  let leftPlayer = "";
  for (let i = 1; i < food.length; i++) {
    leftPlayer += i.toString().repeat(parseInt(food[i] / 2)); //toString으로 i를 문자로 바꾸고 repeat 안에 음식의 양을 2개로 나눈 값의 몫만 가져와 answer에는 1113과 같은 값이 들어가도록 함
  }
  rightPlayer = leftPlayer.split("").reverse().join("");
  //그 후에 1113을 다 가져왔으면 0(물)을 넣고 1113을 거꾸로 뒤집은 3111을 뒤집어서 답을 완성함
  return `${leftPlayer}0${rightPlayer}`;
}

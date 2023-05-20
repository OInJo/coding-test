const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on("line", function (line) {
  input = line.split(" ");
}).on("close", function () {
  n = Number(input[0]); //입력한 값이 n에 들어가있음
  if (n % 2 == 0) {
    //짝수면
    console.log(`${n} is even`); //백틱을 이용한 출력
  } else {
    console.log(`${n} is odd`);
  }
});

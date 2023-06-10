function solution(id_pw, db) {
  let answer = "";
  db.forEach((db) => {
    if (id_pw[0] === db[0] && id_pw[1] === db[1]) {
      //id pw 모두 같으면 answer에 login이라는 문자열을 추가함
      answer += "login";
    } else if (id_pw[0] === db[0]) {
      answer += "wrong pw";
    } else answer += "fail";
  });
  // 그냥 return answer을 하면 db의 마지막 배열과만 비교하여 값이 마지막에 바뀌는 문제가 발생하여, answer에 값을 차곡차곡 저장하고, 한번이라도 login 됐으면 login을 return, 아니고 wrong pw가 있으면 wrong pw을 return, 아니면 fail을 return
  return answer.includes("login")
    ? "login"
    : answer.includes("wrong pw")
    ? "wrong pw"
    : "fail";
}

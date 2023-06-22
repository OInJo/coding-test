function solution(id_pw, db) {
    for (let i = 0; i < db.length; i++) {
      if (id_pw[0] === db[i][0]) {  // 입력된 아이디와 회원의 아이디 비교
        if (id_pw[1] === db[i][1]) {  // 입력된 비밀번호와 회원의 비밀번호 비교
          return "login";  // 아디디와 비밀번호가 모두 일치하는 경우 login
        } else {
          return "wrong pw";  // 아이디는 일치하지만 비밀번호가 일치하지 않는 경우 wrong pw
        }
      }
    }
    return "fail";  // 일치하는 아이디가 없는 경우 fail
  }
  
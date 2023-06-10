function solution(id_pw, db) {
    const memberinfo = db.find((member) => member[0] === id_pw[0]);
    // find() : 배열의 요소를 순차적으로 순회하면서 조건에 일치하는 요소의 값 반환
    // 일치하는 회원 정보 memberinfo에 저장
    if(!memberinfo) { // 아이디 불일치
        return "fail";
    }
    if(memberinfo[1] === id_pw[1]){ 
        // 아이디 일치 후 등록 되어있는 비밀번호랑 입력된 비밀번호 비교
       return "login"; // 같을 시 "login"
    } else { // 비밀번호 다를 경우
        return "wrong pw"; // "wrong pw"
    }
}
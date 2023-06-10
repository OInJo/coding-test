class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(int i=0; i< db.length; i++) {       // id가 같은지 확인
            if(id_pw[0].equals(db[i][0])) {     // id가 같은데 pw도 같으면 login
                if(id_pw[1].equals(db[i][1])) {
                    answer = "login";
                    break;
                }
                else {                          // id는 같지만 pw가 다르면 wrong pw
                    answer = "wrong pw";
                    break;
                }
            }
            else {                              // id가 다르면 fail
                answer = "fail";
            }
        }
        return answer;
    }
}
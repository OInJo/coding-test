class Solution {
    public String solution(String[] id_pw, String[][] db) {
        int id = 0;
        int pw = 0;
        for(String[] n : db){
            if(n[0].equals(id_pw[0])) // 아이디가 같은 경우
                id++;
            if(n[0].equals(id_pw[0]) && n[1].equals(id_pw[1])) // 아이디 비밀번호가 같은 경우
                pw++;
        }
        return pw > 0 ? "login" : id > 0 ? "wrong pw" : "fail"; 
    }
}
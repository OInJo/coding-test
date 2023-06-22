import java.util.HashMap;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> map = new HashMap<String, String>();    //HashMap은 키와 값의 형태를 띄움.
        for (String[] strings : db) {
            map.put(strings[0],strings[1]);     //아이디 비밀번호를 아이디를 키로 비밀번호를 값으로 등록한다.
        }

        if(map.containsKey(id_pw[0])) {  //맵에 key값(아이디)이 있는지 확인 가능
            if (map.get(id_pw[0]).equals(id_pw[1]))  //map에 매핑된 비밀번호와 id_pw 배열에 저장되어있는 비밀번호를 비교
                return "login";
            else
                return "wrong pw";
        } else return "fail";
        
    }
}
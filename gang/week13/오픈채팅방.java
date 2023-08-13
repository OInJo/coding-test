import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        List<String> message = new ArrayList<>();
        Map<String, String> user = new HashMap<>();

        for (int i=0; i<record.length; i++) {
            String[] parts = record[i].split(" ");  // 문장을 띄어쓰기를 기준으로 나눔
            String act = parts[0];  // 행동
            String uid = parts[1];  // 아이디

            if (act.equals("Enter")) {  // 행동이 Enter면
                String nick = parts[2];
                user.put(uid, nick);    // user에 아이디와 닉네임 저장
            }
            else if(act.equals("Change")) { // 행동이 Change면
                String nick = parts[2];
                user.replace(uid, nick);    // user에 닉네임 바꿈
            }
        }

        for (int i=0; i<record.length; i++) {
            String[] parts = record[i].split(" ");
            String act = parts[0];
            String uid = parts[1];
            String nick = user.get(uid);    // 아이디로 닉네임을 찾음

            if (act.equals("Enter")) {
                message.add(nick + "님이 들어왔습니다.");
            } else if (act.equals("Leave")) {
                message.add(nick + "님이 나갔습니다.");
            }
        }

        return message.toArray(new String[0]);  // List를 배열로 바꿔서 리턴
    }
}
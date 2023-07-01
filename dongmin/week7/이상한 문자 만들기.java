import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str=s.split(" ",-1);           //매개 변수 s에는 마지막에 공백 문자가 여러개 올 수도 있음
                                                    //그것을 해결하기 위한 limit를 -1로 지정해줌
                                                    //limit가 양수일 경우에는 마지막에 공백 문자를 전부 무시
                                                    //문자열에서 가능한 모든 부분 문자열을 생성하여 반환
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                answer += j%2 ==0?Character.toUpperCase(str[i].charAt(j)):Character.toLowerCase(str[i].charAt(j));
            }
            if(i != str.length-1)       //마지막 인덱스에는 공백이 들어가지 않도록 예외 처리
                answer+=" ";

        }

        return answer;       //문자열 앞 뒤에 공백을 제거해줌
    }
}
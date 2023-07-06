import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        int n = 0;
        for (int i = 0; i < seoul.length; i++) {
        if (seoul[i].equals("Kim")) {
            n = i;
        }
    }
        return "김서방은 "+ n +"에 있다";
    }
}

// indexOf() 메서드는 원시 타입 배열 int, double, char 등에서 사용 가능 
// 그러므로 배열에 다 접근하여 일치하는지 확인 후 값 도출
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        List<String> stringToInt = new ArrayList<>();
        for (int i = 0; i <= t.length() - p.length(); i++) {
            stringToInt.add(t.substring(i,i+p.length()));
        }

        for (int i = 0; i < stringToInt.size(); i++) {
            if (Long.valueOf(stringToInt.get(i)) <= Long.valueOf(p))
                answer++;
        }
        return answer;
    }
}
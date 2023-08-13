import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String X, String Y) {
        List<Integer> pair = new ArrayList<>();
        int[] cntX = new int[10];
        int[] cntY = new int[10];

        for (int i = 0; i < X.length(); i++) {  // String X의 각 숫자의 횟수만틈 증가
            int num = Integer.parseInt(String.valueOf(X.charAt(i)));
            cntX[num]++;
        }

        for (int i = 0; i < Y.length(); i++) {  // String Y의 각 숫자의 횟수만틈 증가
            int num = Integer.parseInt(String.valueOf(Y.charAt(i)));
            cntY[num]++;
        }

        for(int i=0; i<=9; i++) {
            int pairCnt = Math.min(cntX[i], cntY[i]);   // 겹치는 숫자 중 더 적은 횟수를 찾아
            for(int j = 0; j < pairCnt; j++) {  // pair에 추가
                pair.add(i);
            }
        }

        if(pair.isEmpty()) {    // 짝이 없으면 0 리턴
            return "-1";
        }

        if (Collections.frequency(pair, 0) == pair.size()) {    // pair가 전부 0 이면 0 리턴
            return "0";
        }

        Collections.reverse(pair);  // 내림차순 정렬

        StringBuilder answer = new StringBuilder(); // 숫자를 문자열로 바꾸기 위함
        for(int i=0; i<pair.size(); i++) {
            answer.append(pair.get(i));
        }

        return answer.toString();
    }
}
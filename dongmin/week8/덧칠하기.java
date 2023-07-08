import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer =0;
        int maxNum = 0;     //칠해진 벽면에 수가 된다.
        for (int i = 0; i < section.length; i++) {
            if (section[i] < maxNum) {      //maxNum과 section에 i번째 인덱스를 비교해서 칠해져있으면 넘어간다.
                continue;
            }
            answer++;       //칠해져있지않으면 answer를 증가시키고
            maxNum = section[i] + m;        //칠해져있지 않으면 그 벽면부터 m번까지 칠한다.
        }
        return answer;
    }
}

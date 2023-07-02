import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int boxCount = score.length / m;
        List<Integer> appleBox = new ArrayList<>();    //한 상자에 담길 사과
        Arrays.sort(score);
        for (int i = 1; i <= score.length; i++) {
            appleBox.add(score[score.length - i]);      //score에 가장 마지막 인덱스부터 내림차 순으로 appleBox에 넣어줌
            if (i % m == 0 && i != 1) {
                answer += appleBox.get(i - 1) * m;      
            }
        }
        return answer;
    }
}
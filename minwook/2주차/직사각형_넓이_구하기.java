import java.util.Arrays; 
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        Arrays.sort(dots, (d1, d2) -> {
    return d1[0]-d2[0]; // 첫번째 숫자 기준 오름차순 
});
        int width = dots[2][0] - dots[0][0]; // 가로
        int length = dots[1][1] - dots[0][1]; // 세로
        if (length < 0)
            length *= -1; // 세로 음수인 경우 변경
        
        return answer = width * length;
    }
}
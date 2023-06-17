import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int w=0;
        int h=0;
        
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);      //sort를 사용하여 값들을 작은 값이 앞으로 오게 한다.
            if(w<sizes[i][0])   w=sizes[i][0];      //첫번째 열에서 가장 큰 값을 w(가로)에 저장
            if(h<sizes[i][1])   h=sizes[i][1];      //두번째 열에서 가장 큰 값을 h(세로)에 저장
        }
        return w*h;
    }
}
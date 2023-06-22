import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int[] max = new int[sizes.length]; 
        int[] min = new int[sizes.length]; // 가로, 세로의 명함 최댓값
        for(int n=0; n<sizes.length; n++){
            min[n] = Math.min(sizes[n][0],sizes[n][1]); // 작은 값들 집합
            max[n] = Math.max(sizes[n][0],sizes[n][1]); // 큰 값들 집합
        }
        return Arrays.stream(max).max().getAsInt() * Arrays.stream(min).max().getAsInt();
    } // 가로, 세로는 변환이 가능 => 작은 값 배열에서 가장 큰 값 * 큰 값 배열에서 가장 큰 값 
}
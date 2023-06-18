class Solution {
    public int solution(int[][] sizes) {
        int w = 0;  // 가로와 세로의 크기를 0으로 지정
        int h = 0;
        for(int i=0; i<sizes.length; i++) {                     // 가로와 세로는 서로 바뀔 수 있기 때문에
            int maxW = Math.max(sizes[i][0], sizes[i][1]);      // 가로와 세로를 비교해서 더 큰수를 넣고
            int maxH = Math.min(sizes[i][0], sizes[i][1]);      // 작은수를 따로 넣어서

            if(maxW > w) {      // 큰 값들 중에서 제일 큰 값을 구하고
                w = maxW;
            }

            if(maxH > h) {      // 작은 값들 중에서 제일 큰 값을 구해서
                h = maxH;
            }
        }

        int answer = w * h;     // 곱하면 지갑의 크기가 된다.
        return answer;
    }
}
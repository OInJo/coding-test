class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[201]; // -100 부터 200까지 정적 배열 공간 할당
        for(int i = 0; i < lines.length; i++) // 3개의 lines
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) // +100으로 최솟값 => 0
                arr[j]++; // 선분 점마다 1씩 증가
        for(int n : arr) 
            if(n > 1) // 겹치는 점이 있으면
                answer++; // 겹치는 선분의 길이 1씩 증가
        return answer;
    }
}
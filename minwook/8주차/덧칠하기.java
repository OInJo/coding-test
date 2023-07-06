class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int c = 0;
        for(int i=0; i<section.length; i++){
            if(c>=section[i])
                continue;
            c = section[i] + m - 1;
            answer++;
        }
        return answer;
    }
} // 첫번째 영역부터 페인트를 칠하는데 칠한 구간이 다음 섹션들에 포함되면 스킵, 아니면 다시 칠하고 영역 재지정
class Solution {
    public int solution(int[][] lines) {
        int[] rail = new int[200];      // 두 점 사이의 거리를 나타내는 rail 변수 생성
        for (int[] line : lines) {      // 두 점의 정보가 담긴 lines 정보를 line에 담음
            for (int j = (line[0] + 100); j < (line[1] + 100); j++) {       //좌표는 음수 값이 될 수 있으므로 값이 
                                                                            // line[0]이 -100일경우 j=0이 됨
                rail[j]++;      //두 점 사이의 거리
            }
        }

        int answer = 0;
        for (int value : rail) {
            if (value > 1)      //rail이 2가 될 경우 겹치는 구간이므로 value가 2이상이면 answer를 1씩 증가시킴
                answer++;
        }
        return answer;
    }
}

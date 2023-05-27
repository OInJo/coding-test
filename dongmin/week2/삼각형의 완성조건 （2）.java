class Solution {
    public int solution(int[] sides) {
        int answer = 0;


        //가장 긴 변이 sides에 있는 경우
        answer=Math.min(sides[0],sides[1]);

        //나머지 한변이 가장 긴 경우
        for(int sMax=Math.max(sides[1],sides[0])+1;(sides[1]+sides[0]>sMax);sMax++)
            answer++;
        return answer;
    }
}
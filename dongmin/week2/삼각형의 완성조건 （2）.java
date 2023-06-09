class Solution {
    public int solution(int[] sides) {
        int answer = 0;


        //가장 긴 변이 sides에 있는 경우
        answer=Math.min(sides[0],sides[1]);     

        //나머지 한변이 가장 긴 경우
        for(int sMax=Math.max(sides[1],sides[0])+1;(sides[1]+sides[0]>sMax);sMax++)     //sMaxs는 변의 길이가 될 수 있는 값들을 정하는 역할
            answer++;
        return answer;
    }
}
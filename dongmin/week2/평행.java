class Solution {
    public double slope(int[] dots1,int[] dots2)        
    {
        return (double) (dots2[1]-dots1[1])/(dots2[0]-dots1[0]);    //기울기를 구하는 함수
    }

    public int solution(int[][] dots) {
        int answer = 0;

        if(slope(dots[0],dots[1])==slope(dots[2],dots[3]))      //첫번째 점과 두번째 점이 세번째, 네번째점과 기울기가 같으면 1리턴 
            return 1;
        if(slope(dots[0],dots[2])==slope(dots[1],dots[3]))      //첫번째 점과 세번째 점이 두번째, 네번째점과 기울기가 같으면 1리턴
            return 1;
        if(slope(dots[0],dots[3])==slope(dots[1],dots[2]))      //첫번째 점과 네번째 점이 두번째, 세번째점과 기울기가 같으면 1리턴
            return 1;
        return answer;
    }
}
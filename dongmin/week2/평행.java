class Solution {
    public double slope(int[] dots1,int[] dots2)
    {
        return (double) (dots2[1]-dots1[1])/(dots2[0]-dots1[0]);
    }

    public int solution(int[][] dots) {
        int answer = 0;

        if(slope(dots[0],dots[1])==slope(dots[2],dots[3]))
            return 1;
        if(slope(dots[0],dots[2])==slope(dots[1],dots[3]))
            return 1;
        if(slope(dots[0],dots[3])==slope(dots[1],dots[2]))
            return 1;
        return answer;
    }
}
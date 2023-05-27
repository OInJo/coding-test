class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza=6;
        for(int i = 1; i<=n; i++) {     
            if(pizza%n==0) {
                answer=i;   
                break;
            }
            pizza+=6;
        }
        return answer;
    }
}
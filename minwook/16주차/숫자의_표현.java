class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i+1; j<n+1; j++){
                sum += j;
                if(sum == n){
                    answer++;
                    break;
                }
                if(sum > n)
                    break;
            }
        }
        return answer;
    }
}
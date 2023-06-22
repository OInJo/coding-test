class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<n; i++){
            if(n%i == 1){ // 나머지가 1이면 종료
                answer = i;
                break;
            }
        }
        return answer;
    }
}
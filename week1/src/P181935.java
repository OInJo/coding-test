class P181935 {
    public int solution(int n) {
        int answer = 0;
        for(int i=n; i>=0; i-=2) {
            if(n%2==0) {
                answer += i*i;
            }
            else {
                answer += i;
            }
        }
        return answer;
    }
}

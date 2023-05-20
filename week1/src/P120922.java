class P120922 {
    public int solution(int M, int N) {
        int cnt = 0;
        if(M==0 && N==0) {
            cnt = 0;
        }
        else {
            cnt = (M * N) - 1;
        }
        int answer = cnt;
        return answer;
    }
}
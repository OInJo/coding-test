class P120897 {
    public int[] solution(int n) {

        int count = 0;
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                count++;
            }
        }

        int[] answer = new int[count];
        int k=0;
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                answer[k] = i;
                k++;
            }
        }
        return answer;
    }
}
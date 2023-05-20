class P120923 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int cnt = num + total;

        for(int i = -cnt; i<=cnt; i++) {
            int sum = 0;
            for(int j = i; j<i + num; j++) {
                sum += j;
            }
            if(sum == total) {
                for(int k=0; k<num; k++) {
                    answer[k] = i + k;
                }
            }
        }

        return answer;
    }
}
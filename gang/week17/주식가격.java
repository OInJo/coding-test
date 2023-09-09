class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length-1; i++) {
            int time = 0;
            for(int j=i+1; j<prices.length; j++) {
                if(prices[i] <= prices[j]) {    // 현재 값과 다른 값들을 비교하여 떨어지지 않았으면 시간 증가
                    time++;
                }
                else {
                    time++; // 떨어졌어도 다음 값으로 넘어갔을 때 이미 1초는 지났기 때문에 시간 증가
                    break;
                }
            }
            answer[i] = time;
        }
        return answer;
    }
}
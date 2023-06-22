class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500; // 아이스 아메리카노의 잔 수
        answer[1] = money - answer[0] * 5500; // 남은 돈 money % answer[0]도 가능
        return answer; // 잔 수와 남은 돈 배열로 출력
    }
}
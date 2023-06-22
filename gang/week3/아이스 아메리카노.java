class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = (money / 5500); // 금액 / 아메리카노 가격해서 잔수 구함
        answer[1] = (money % 5500); // 금액 % 아메리카노 가격 해서 잔돈 구함
        return answer;
    }
}
class Solution {
    public int solution(int chicken) {
        int coupon = chicken;

        int answer = 0;
        while(coupon>=10)
        {
            coupon-=10;
            answer++;
            coupon++;
        }

        return answer;
    }
}
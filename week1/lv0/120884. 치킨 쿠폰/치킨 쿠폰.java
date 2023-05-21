class Solution {
    public int solution(int chicken) {
        int coupon = chicken;       //쿠폰에 치킨 값을 넣음(치킨 한개 구매시 쿠폰도 하나가 추가 되기 때문)

        int answer = 0;             //서비스 치킨의 수, 초기 값은 0으로 세팅
        while(coupon>=10)           //쿠폰이 10개보다 작을때까지 while문을 돌림
        {
            coupon-=10;             //쿠폰을 10개씩 뺌.
            answer++;               //쿠폰 10개를 소비하여 서비스 치킨을 한마리 올림
            coupon++;               //서비스 치킨 한마리를 받았으므로 쿠폰도 하나를 받게 됨
        }

        return answer;              //최종 서비스 치킨에 개수
    }
}
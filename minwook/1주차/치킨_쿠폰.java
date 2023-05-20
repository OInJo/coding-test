public class Solution {
    public int solution(int chicken) {

            int answer = 0;
            int num = chicken;
            int remainCoupon = 0;

            while (chicken >= 10)
            {
                chicken /= 10;
                remainCoupon += (num % 10); // 쿠폰 남은거 
                num = chicken;
                if (chicken < 10)
                {
                    remainCoupon += chicken; // 서비스 치킨 쿠폰 + 쿠폰 남은거
                }
            while (remainCoupon >= 10) // 남은 쿠폰 10개 이상 서비스 치킨 계산
            {
                remainCoupon -= 10; // 서비스 쿠폰 사용할 때 마다 쿠폰 추가 및 서비스 치킨 개수 추가
                answer++;
                remainCoupon++;
            }
                answer += chicken; // 처음 서비스 치킨 추가 
            }
        return answer;
    }
}
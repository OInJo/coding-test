function solution(chicken) {
    let coupon = 0;
    let serchi = 0; // 서비스 치킨
    while(chicken >= 10) {
       serchi = parseInt(chicken/10); // 현재 서비스 받는 치킨 수
        recoupon = chicken%10; // 남은 쿠폰 수
        coupon += serchi; // 서비스 치킨까지 받고 추가된 쿠폰 수
        chicken = serchi + recoupon;
    }
    return coupon;
}
function solution(chicken) {
    let answer = 0;
    let coupon = chicken;

    while (coupon >= 10) {
        answer += parseInt(coupon / 10);
        coupon = parseInt(coupon / 10) + coupon % 10;
    }

    return answer;
}
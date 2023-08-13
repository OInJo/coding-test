function solution(a, b, n) {
    let bottle = 0;
    while(n >= a) {
        let addbottle = Math.floor(n / a) * b; // 얻은 콜라병
        bottle += addbottle; // 총 얻은 콜라병
        n = addbottle + (n % a); // 현재 내가 가지고 있는 병 수
    }
    return bottle;
}
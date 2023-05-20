function solution(numer1, denom1, numer2, denom2) {
    let numer = numer1*denom2 + numer2*denom1; // 분자
    let denom = denom1*denom2; // 분모
    let gcd = 1; // 최대공약수
    
    for(let i = 1; i <= denom; i++) {
        if(numer % i == 0 && denom % i ==0) { // 분모와 분자의 최대공약수 구하는 식
            gcd = i;
        }
    }
    return [numer/gcd, denom/gcd] // 기약 분수로 표현된 값 배열
}
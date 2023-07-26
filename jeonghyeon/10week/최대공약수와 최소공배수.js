function solution(n, m) {
    var div = []; // 공약수
    for(let i = 1; i <= n; i++) { // 공약수 찾기
        if(n % i == 0 && m % i == 0) {
            div.push(i);
        }
    }
    let gcd = Math.max(...div); // 최대공약수
    let lcm = n * m / gcd; // 최소공배수
    return [gcd, lcm];
}
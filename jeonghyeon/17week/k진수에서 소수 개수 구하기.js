function solution(n, k) {
    let answer = 0;
    let kn = n.toString(k); // k진수로 바꿈
    let num = kn.split("0");
    for(let i = 0; i < num.length; i++) {
        if(prime(num[i])) { // 소수 찾기
            answer++;
        }
    }
    return answer;
}

// 소수 판단
function prime(n) {
    if(n < 2) {
        return false;
    }
    for(let i = 2; i <= Math.sqrt(n); i++) {
        if(n % i == 0) {
            return false;
        }
    }
    return true;
}
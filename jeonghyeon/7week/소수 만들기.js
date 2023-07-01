function solution(nums) {
    let primenum = 0; // 소수 개수
    for(let i = 0; i < nums.length - 2; i++) {
        for(let j = i + 1; j < nums.length - 1; j++) {
            for(let k = j + 1; k < nums.length; k++) {
                const sum = nums[i] + nums[j] + nums[k];
                if(findprime(sum)) { // sum이 소수라면
                    primenum++; // 소수개수 증가
                }
            }
        }
    }
    return primenum; // 결과
}

function findprime(n) { // 소수인지 판단
    if(n < 2) { // 0,1 소수 아님
        return false;
    }
    for(let i = 2; i < n; i++) { // n보다 작은 어떤 수로 나누어 떨어지는지 확인
        if(n % i == 0) { // n이 나누어 떨어지면 소수가 아님
            return false;
        }
    }
    return true; // 소수인 경우
}
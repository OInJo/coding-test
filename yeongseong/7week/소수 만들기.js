function isPrime(num){
    // 소수인지 판별 할 함수
    if (num <= 1){ 
        return false;
    }
    for (let i = 2; i <= Math.sqrt(num); i++){
        if (num % i == 0){
            return false
        }
    }
    return true;
}
function solution(nums) {
    let decimal = 0;
    let sum = 0;
    for (let i = 0; i < nums.length; i++){
        for (let j = i + 1; j < nums.length; j++) {
            for (let k = j + 1; k < nums.length; k++){
              sum = nums[i] + nums[j] + nums [k] 
                if (isPrime(sum)){ // 더한 값이 소수인지 확인
                   decimal++
                }
            }
        }
    }
    
    return decimal;
}
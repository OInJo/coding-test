function solution(numbers) {
    let sum = 0;
    for(let i = 0; i <= 9; i++) {
        if(!numbers.includes(i)) { // numbers배열에 0~9까지의 숫자가 있는지 확인하고 없으면
            sum += i; // 더한다
        }
    }
    return sum; // 없는 수들 합해서 반환
}
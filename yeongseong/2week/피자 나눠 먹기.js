function solution(n) {
    for (let i = 1; i < n; i++){
        // 변수 i를 시작하여 n 보다 작을 때까지 1씩 증가시킵니다.
        if(6 * i % n === 0){
            // 6 * i를 n으로 나눈 나머지가 0인 경우를 찾습니다.            
            return i;
        }
    }
}
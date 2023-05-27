function solution(n) {
    var answer = [];
    let i = 2;
    while(n > 1) {
        if(n % i == 0) { // i는 n의 소인수
            n /= i; // n을 i로 나눠 소인수 제거
            answer.push(i); // 소인수로 추가
        } else
            i++; // 1이하면 증가
    }
    
    return Array.from(new Set(answer)); // 중복을 제거해서 리턴
}
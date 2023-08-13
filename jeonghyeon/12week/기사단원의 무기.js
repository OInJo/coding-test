function solution(number, limit, power) {
    var answer = 0;
    
    for(let i = 1; i <= number; i++) {
        let div = 0;
        for(let j = 1; j <= Math.sqrt(i); j++) {
            if(i % j == 0) {
                div += 2;
                if(i / j == j) {
                    div--;
                }
            }
        }
        if(div > limit) {
            answer += power;
        } else {
            answer += div;
        }
    }
    return answer;
}

// number 돌면서 약수 개수 구함
// 약수 개수 > limit answer += power
// 약수 개수 <= limit answer += 약수 개수
// return answer
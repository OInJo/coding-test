function solution(price, money, count) {
    let sum = 0;
    for(let i = 1; i <= count; i++) {
        sum += price * i; // 놀이기구 타는데 쓰인 돈
    }
    const shortage = sum - money; // 사용된 돈에서 가지고 있는 돈을 뺀 값
    
    if(shortage > 0) { // 사용된 돈이 더 많으면
        return shortage; // 모자란 돈 반환
    } else
        return 0; // 금액이 부족하지 않다면 0
}
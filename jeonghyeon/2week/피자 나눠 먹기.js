function solution(n) {
    let pizzaslices = 6; // 한 판 피자 조각 개수
    
    while(pizzaslices % n != 0) { // 피자 조각의 개수를 n으로 나눈 값이 0이 아니면 계속 반복
        pizzaslices += 6; // 한 판 추가
    }
    return pizzaslices / 6; // 피자 판 수
}
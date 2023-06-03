function solution(money) {
    // 커피 한잔 가격
    const coffee = 5500;
    // 구매 가능한 커피의 개수
    const number = Math.floor(money / coffee);
    // 거스름돈
    const change = money % coffee;
    
    return [number, change];
}
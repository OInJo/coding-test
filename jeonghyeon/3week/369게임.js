function solution(order) {
    const stringnum = [...String(order)]; // 숫자를 문자열로 바꿔서 배열 생성
    
    // filter() : 조건에 맞는 요소들 모아 배열로 반환
    const threesixnine = stringnum.filter((n) => ['3', '6', '9'].includes(n));
    // 369만 골라서 배열 생성
    return threesixnine.length; // 369만 모인 배열의 크기 리턴
}
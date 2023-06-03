function solution(num_list) {
    // filter() : 조건에 맞는 요소들 모아 배열로 반환
    const even = num_list.filter(x => x % 2 == 0).length; // 짝수의 개수
    const odd = num_list.filter(x => x % 2 == 1).length; // 홀수의 개수
    return [even, odd]; // 개수들 배열
}
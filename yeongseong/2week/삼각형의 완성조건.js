function solution(sides) {
    const  min = Math.min(...sides);
    // sides 에서 가장 작은 값을 찾습니다.
    return min * 2 - 1;
    // 가장 작은 값에서 2를 곱하고 1을 빼서 결과릅 받습니다.
}

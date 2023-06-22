function solution(common) {
    let next;
    if(common[1] - common[0] == common[2] - common[1]) { // 배열이 등차수열일 때
        next = common[common.length - 1] + (common[1] - common[0]);
        // 배열의 맨 끝 숫자에 공차 더하기
    } else { // 배열이 등비수열일 때
        next = common[common.length - 1] * (common[1] / common[0]);
        // 배열의 맨 끝 숫자에 공비 곱하기
    }
    return next;
}
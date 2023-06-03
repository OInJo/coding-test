function solution(order) {
    var answer = 0;
    // 입력된 숫자를 문자열로 변환하고 각 자릿수를 순회하면서 검사합니다.
    for (let number of String(order)){
        // 3, 6, 9가 나올 때마다 answer 값을 1씩 증가시킵니다.
        if (number === '3'|| number==='6' || number==='9') answer++
    }
    // 3, 6, 9의 총 횟수를 반환
    return answer;
}
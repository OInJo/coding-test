function solution(numbers) {
    var answer = []; // 두 수를 더한 값 넣을 배열
    for(let i = 0; i < numbers.length - 1; i++) { // 마지막 인덱스까지 모든 수의 조합 반복
        for(let j = i + 1; j < numbers.length; j++) { // 현재 i요소 부터 마지막 요소까지 모든 수의 조합 반복
            const sum = numbers[i] + numbers[j]; // 두 수를 더함
            answer.push(sum); // 더해진 수 배열에 추가
        }
    }
    const ascnum = answer.sort((a, b) => a - b); // 더해진 배열 오름차순
    const sumnum = Array.from(new Set(ascnum)); // 오름차순으로 정렬된 배열에서 중복 없애기
    return sumnum;
}
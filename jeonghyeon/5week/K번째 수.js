function solution(array, commands) {
    var answer = [];
    for(let i = 0; i < commands.length; i++) { // commands 배열의 길이만큼 반복
        const [start, end, k] = commands[i] // commands 배열의 i 요소를 [start, end, k] 로 분할
        const sliceArray = array.slice(start-1, end); // 범위 만큼 잘라옴
        const ascArray = sliceArray.sort((a, b) => a - b); // slicearray 배열을 오름차순으로 정렬
        const knum = ascArray[k - 1]; // 오름차순으로 정렬 되어진 ascarray에서 k-1번쨰 숫자 찾기
        answer.push(knum); // k-1번쨰 숫자 찾아서 배열 추가
    }
    return answer;
}
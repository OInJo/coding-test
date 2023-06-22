function solution(array, commands) {
    var answer = [];
    for (let i = 0; i < commands.length; i++) {
        // 시작 인덱스 (0부터 시작하는 인덱스로 조정)
        const start = commands[i][0] - 1; 
        // 끝 인덱스
        const end = commands[i][1]; 
        // k번째 값의 인덱스 (0부터 시작하는 인덱스로 조정)
        const k = commands[i][2] - 1; 
        // 원본 배열에서 시작 인덱스부터 끝 인덱스 이전까지의 부분 배열 생성
        const ary = array.slice(start, end);
        // 부분 배열을 오름차순으로 정렬
        ary.sort((a, b) => a - b);
        answer.push(ary[k]);
    }
    return answer;
}

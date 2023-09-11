function solution(participant, completion) {
    participant.sort();
    completion.sort(); // 오름차순으로 정렬
    for(let i = 0; i < participant.length; i++) {
        if(participant[i] !== completion[i]) {
            return participant[i];
        } // 같은 인덱스의 요소를 비교해서 다르면 출력
    }
}
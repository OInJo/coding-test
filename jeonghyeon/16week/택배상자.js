function solution(order) {
    let answer = 0;
    let n = 0;
    const stack = [];
    for(let i = 1; i <= order.length; i++) {
        if(i !== order[n]) {
            stack.push(i);
            continue; // stack에 들어가면 다음 번호 살펴봄
        } 
        // 번호 일치 시
        answer++ // 들어갈 박스 추가
        n++; // 그 다음 들어갈 박스 번호
        while(stack.length !== 0 && stack.at(-1) === order[n]) {
            stack.pop();
            answer++;
            n++
        }
    }
    return answer;
}
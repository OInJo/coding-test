function solution(n) {
    let nextnum = n + 1;
    while(true) {
        let nOne = n.toString(2).split('').filter(i => i === '1').length; // 2진법으로 변환, 1 개
        let nextOne = nextnum.toString(2).split('').filter(i => i === '1').length;
        if(nOne === nextOne) {
            break; // 현재 수와 1 큰 수의 1 개수가 같으면 while문 끝
        }
        nextnum++; // 하나씩 증가
    }
    return nextnum;
}
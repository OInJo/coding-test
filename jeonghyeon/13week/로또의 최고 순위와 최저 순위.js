function solution(lottos, win_nums) {
    var answer = []; // 답
    let zero = 0; // 0으로 표시한 숫자 개수
    let num = 0; // 맞는 숫자 개수
    for(let n of lottos) {
        if(n === 0) { // 0으로 표시된 숫자 개수 증가
            zero++; 
        } else if(win_nums.includes(n)) {
            num++; // win_nums에 있는 숫자라면 맞는 숫자 개수 증가
        }
    }
    
    let max = (zero === 0 && num === 0) ? 6: 7 - (zero + num); // 0으로 표시된 것이 없고 다 틀리면 6, 아니면 맞는 개수num과 zero를 다 맞다 생각한 수
    let min = num === 0 ? 6 : 7 - num; // 맞는 개수가 0개면 6, 맞는 개수가 있으면 그 등수
    return [max, min];
}
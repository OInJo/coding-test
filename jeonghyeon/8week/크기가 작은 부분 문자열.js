function solution(t, p) {
    let pnumber = [];
    let choosenum = [];
    
    for(let i = 0; i <= t.length - p.length; i++) {
        let cutt = t.slice(i, i + p.length);
        // p길이만큼 자르기
        pnumber.push(cutt); // 자른 숫자 pnumber배열에 추가
    }
    for(let j = 0; j < pnumber.length; j++) { // pnumber배열 하나씩 반복
        if(pnumber[j] <= p) { // p보다 작거나 같은 수 찾기
            choosenum.push(pnumber[j]) // 작거나 같은 수 배열 추가
        }
    }
    return choosenum.length;
}
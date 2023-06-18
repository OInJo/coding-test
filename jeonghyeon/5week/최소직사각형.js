function solution(sizes) {
    let maxw = 0;
    let maxh = 0;
    for (let i = 0; i < sizes.length; i++) {
        let [w,h] = sizes[i].sort((a,b) => b-a); // 내림차순
        if(w > maxw) { // 현재 w가 지금까지의 최대 w보다 큰지 확인
            maxw = w; // 현재가 크면 현재 w를 최대w로 바꿈
        }
        if(h > maxh) { // 현재 h가 지금까지의 최대 h보다 큰지 확인
            maxh = h; // 현재가 크면 현재 h를 최대h로 바꿈
        }
    }
    return maxw * maxh;
}
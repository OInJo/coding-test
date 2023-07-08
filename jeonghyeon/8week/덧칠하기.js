function solution(n, m, section) {
    let count = 0; // 칠하는 수
    let fill = 0; // 마지막 칠한 위치
    for(let i = 0; i < section.length; i++) {
        if(section[i] >= fill) { // 현재 위치가 이미 칠해진 마지막 위치보다 크거나 같은 경우
            fill = section[i] + m; // 현재 위치부터 m만큼 칠하고, 그 위치 마지막 위치로 저장
            count++;
        }
    }
    return count;
}
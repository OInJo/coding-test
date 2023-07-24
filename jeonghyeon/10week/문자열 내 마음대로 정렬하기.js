function solution(strings, n) {
    strings.sort((a, b) => {
        if(a[n] > b[n]) { // 같은 인덱스에서 더 큰 문자 찾기
            return 1; // ba
        } else if(a[n] < b[n]) {
            return -1; // ab
        } else if(a[n] === b[n]) { // 같은 알파벳
            if(a > b) { // ba
                return 1;
            } else { // ab
                return -1;
            }
        }
    });
    return strings;
}
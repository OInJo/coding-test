function solution(k, tangerine) {
    var answer = 0;
    const count = {}; // 귤 크기 개수 저장
    // 각 종류의 개수
    tangerine.forEach(i => { count[i] = ++count[i] || 1});
    const sort = Object.values(count).sort((a,b) => b-a); // 개수만 추출해 내림차순 정렬
    for(let i = 0; i < sort.length; i++) {
        if(k <= 0) {
            break;
        }
        k -= sort[i];
        answer++;
    }
    
    return answer;
}
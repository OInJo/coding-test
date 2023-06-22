function solution(array, n) {
    const differ = []; // 차이 배열 만들기
    for (let i = 0; i < array.length; i++) { 
        differ.push(Math.abs(array[i] - n));
    } // 각 요소랑 n과의 차이 계산해 배열에 추가
    const mindiffer = Math.min(...differ);
    // differ 배열에서 가장 작은 값 찾기
    
    let minnum = null; // minnum 변수를 초기값으로 설정
    for (let i = 0; i < array.length; i++) {
        if (differ[i] == mindiffer) { // 가장 작은 값과 같을 때
            if (minnum == null || array[i] < minnum) { // 더 작으면 바꿈
                minnum = array[i];
            }
        }
    }
    return minnum; // 가장 가까운 수 반환
}
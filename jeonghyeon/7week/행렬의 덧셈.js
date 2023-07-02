function solution(arr1, arr2) {
    let sum = [[]]; // 결과 배열
    for(let i = 0; i < arr1.length; i++) {
        sum[i] = []; // 각 행 빈 배열로 초기화
        for(let j = 0; j < arr1[i].length; j++) {
            sum[i][j].push(arr1[i][j] + arr2[i][j]); // arr1, arr2 같은 위치에 있는 값 더해서 배열에 추가
        }
    }
    return sum;
}
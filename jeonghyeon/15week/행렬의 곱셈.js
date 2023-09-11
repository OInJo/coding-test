function solution(arr1, arr2) {
    var answer = [];
    for(let i = 0; i < arr1.length; i++) {// arr1의 행의 개수만큼 돔
        answer.push([]);
        for(let j = 0; j < arr2[0].length; j++) { // 두번째 배열의 열 수
            let sum = 0;
            for(let k = 0; k < arr1[i].length; k++) {
                sum += arr1[i][k] * arr2[k][j];
            }
            answer[i].push(sum);
        }
    }
    return answer;
}

// arr1의 행 * arr2의 열
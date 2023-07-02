function solution(arr1, arr2) {
    var answer = []; // 결과를 저장할 배열
    let sum = 0;
    for (let i = 0; i < arr1.length; i++){
        sum = []; // 현재 행의 덧셈 결과를 저장할 빈 배열
        for (let j = 0; j < arr1[i].length; j++){
            sum.push(arr1[i][j] + arr2[i][j]);
        }
        answer.push(sum);
    }
    return answer;
}
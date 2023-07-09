function solution(food) {
    var answer = '';
    for (let i = 1; i < food.length; i++) {
        var half = parseInt(food[i] / 2); // 현재 음식 2로 나누는 몫
        for (let j = 0; j < half; j++) { // 현재 음식을 반복할 수 22333 나오는 것처럼
          answer += i; // 현재 음식 인덱스 값 추가
        }
    }
    var reversed = answer.split('').reverse().join(''); // answer의 반대로
    return answer + '0' + reversed; // 가운데 0을 추가하고 나열
}
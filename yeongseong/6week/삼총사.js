function solution(number) {
    var answer = 0;
    for (let i = 0; i < number.length; i++){ // 첫 번째 학생
        for (let j = i + 1; j < number.length; j++){ // 두 번째 학생
            for (let k = j + 1; k < number.length; k++){ // 세 번째 학생
                if (number[i] + number[j] + number[k] == 0){
                    answer++;
                }
            }
        }
    }
    return answer;
}

function solution(number) {
    var threenum = 0; // 세 개의 수의 합이 0이 되는 경우의 수
    for(let i = 0; i < number.length - 2; i++) { // 처음부터 끝에서 세번째 까지 반복
        for(let j = i + 1; j < number.length - 1; j++) { // i 다음 숫자부터 배열 끝에서 두번째 까지 반복
            for(let k = j + 1; k < number.length; k++) { // j 다음 숫자부터 배열의 마지막 까지 반복
                if(number[i] + number[j] + number[k] == 0) { // 세 숫자의 합이 0이면
                    threenum += 1; // 경우의 수 증가
                }
            }
        }
    }
    return threenum;
}
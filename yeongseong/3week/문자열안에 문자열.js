function solution(str1, str2) {
    var answer = 0;
    // str1이 str2를 포함하는지 확인
    if (str1.includes(str2)){
        answer = 1
    } else{
        answer = 2
    }
    return answer;
}
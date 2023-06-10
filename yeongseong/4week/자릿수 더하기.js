function solution(N)
{
    var answer = 0;
    let num = N.toString(); // 정수를 문자열로 변환하여 각 자릿수에 접근
    for (let i = 0; i < num.length; i++){
        answer += parseInt(num[i]); // 각 자릿수를 정수로 변환하여 합산
    }
    return answer;
}
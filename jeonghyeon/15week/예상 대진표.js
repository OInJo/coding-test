function solution(n,a,b)
{
    var answer = 0;
    while(a !== b) {
        a = Math.ceil(a / 2); // 다음 번호 부여
        b = Math.ceil(b / 2);
        answer++; // 라운드 증가
    }
    return answer;
}
// 각 a,b를 2로 나누고 올림
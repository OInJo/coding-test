function solution(s) {
    var answer = '';
    if(s.length % 2 == 0) { // 짝수 개수면 가운데 두개 뽑기
        answer = s[s.length / 2 - 1] + s[s.length / 2];
    } else { // 홀수 개수면 가운데 한개
        answer = s[Math.floor(s.length / 2)];
    }
    return answer;
}
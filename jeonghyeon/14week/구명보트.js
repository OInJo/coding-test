function solution(people, limit) {
    var answer = 0;
    people.sort((a,b) => b-a); // 내림 차순
    let firstnum = 0; // 두개의 숫자 중 앞
    let endnum = people.length - 1; // 두개의 숫자 중 뒤
    while(firstnum < endnum) {
        if(people[firstnum] + people[endnum] <= limit) {
            firstnum++;
            endnum--;
        } else {
            firstnum++; // 제일 작은 수와 그 다음 큰 수 더하기
        }
        answer++;
    }
    if(firstnum === endnum) answer++; // 숫자 하나 남음
    return answer;
}
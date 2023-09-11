function solution(progresses, speeds) {
    var answer = [];
    const finish = progresses.map((p, i) => Math.ceil((100- p) / speeds[i])); // 걸리는 일수
    let day = finish[0]; // 앞 기능의 끝나는 기간
    let count = 0; // 배포 기능 수 
    
    for(let i = 0; i < finish.length; i++) {
        if(finish[i] <= day) {
            count++;
        } else {
            answer.push(count);
            count = 1;
            day = finish[i];
        }
    }
    
    answer.push(count);
    return answer;
}
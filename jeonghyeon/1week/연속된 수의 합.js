function solution(num, total) {
    var answer = [];
    
    var a = total/num -(num-1)/2
    for(i=a; i <= a + (num-1); i++) {
        answer.push(i);
    }
    return answer;
}
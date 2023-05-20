function solution(num, total) {
    var answer = [];
    if(total % num === 0){
        const center = total/num
        answer.push(center)
        let i = 1;
        while(answer.length<num){
            answer = [center-i, ...answer, center+i]
            i++
        }
        return answer
    }
    const center= Math.floor((total / (num/2))/2);
    let i = 1;
    answer.push(center,center+1)
    while(answer.length<num){
        answer = [center-i, ...answer, center+i+1]
        i++
    }

    return answer;
}
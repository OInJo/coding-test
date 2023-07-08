function solution(t, p) {
    var answer = 0;
    let nump = p.length;
    let substrings = t.length - nump + 1;
    let numsubstring = 0
    let substring = 0;
    for (let i = 0; i < substrings; i ++) {
        substring = t.slice(i, i + nump);
        numsubstring = Number(substring);
       if (numsubstring <= Number(p)) {
           answer++
       }
    }
    return answer;
}
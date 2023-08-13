function solution(s)
{
    let sArr = []; // 문자열 하나씩 들어갈 배열
    for(let i = 0; i < s.length; i++) {
        sArr.push(s[i]);
        if(sArr[sArr.length-1] === sArr[sArr.length-2]) { // 현재 문자와 전 문자가 같은지 비교
            sArr.pop();
            sArr.pop(); // 같은 문자 두개 제거
        }
    }
    if(sArr.length == 0) {
        return 1; // 다 제거되었음
    } else return 0; // 문자가 남아있음
}
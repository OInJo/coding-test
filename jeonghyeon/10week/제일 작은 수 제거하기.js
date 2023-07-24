function solution(arr) {
    let answer = [];
    if(arr.length <= 1) { // 하나있을 경우 -1
        return [-1];
    } else {
        arr.splice(arr.indexOf(Math.min(...arr)), 1); // 제일 작은 수 자름
        return arr;
    }   
}
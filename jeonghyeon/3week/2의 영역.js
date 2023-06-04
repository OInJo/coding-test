function solution(arr) {
    const two = [];
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] == 2) {
            two.push(i); // 배열안의 2 찾기
        }
    }
    
    if(two.length == 0) {
        return [-1]; // 배열안에 2가 없으면 -1 리턴
    } else { // 2가 있을 경우
        let start = two[0]; // 가장 처음 나오는 2
        let end = two[two.length - 1]; // 가장 끝의 2
        return arr.slice(start, end + 1); // 2가 나오는 부분만 자르기
    } 
}
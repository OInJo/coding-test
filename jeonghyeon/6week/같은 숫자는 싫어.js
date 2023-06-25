function solution(arr)
{
    var num = [];
    for(let i = 0; i < arr.length; i++) { // 현재 i부터 끝까지 반복
        if(arr[i] != arr[i + 1]) { // 현재와 그 다음수가 다른지 비교
            num.push(arr[i]); // 다르면 배열에 추가
        }
    }
    return num;
}
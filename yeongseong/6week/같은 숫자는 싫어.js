function solution(arr)
{
    var answer = [];
    
    for (let i = 0; i < arr.length; i++){
        if (arr[i] !== arr[i+1]){ // 현재 수와 다음 수가 다를 때
            answer.push(arr[i]);
        }
    }
    return answer;
}
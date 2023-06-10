function solution(n)
{
    let sum = 0;
    const eachnumber = String(n).split('').map(Number); 
    // 자연수 n을 문자열로 변환 후 문자로 분리해 배열을 만들고 map(Number)를 이용해 각각의 숫자로 변환한다
    
    for(let i = 0; i < eachnumber.length; i++) {
        sum += eachnumber[i];
    } // 각 자릿수를 더해서 출력
    return sum;
}
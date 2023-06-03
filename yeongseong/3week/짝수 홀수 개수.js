function solution(num_list) {
    let even = 0; // 짝수의 개수를 저장할 변수
    let odd = 0; // 홀수의 개수를 저장할 변수
    // num_list 배열의 각 원소를 순회하며 number 변수에 할당
    for (let number of num_list){ 
        if (number % 2 === 0) {
            // 숫자가 짝수인 경우  even 변수를 1증가
            even++; 
        } else {
            // 숫자가 홀수인 경우  odd 변수를 1증가
            odd++;
        }
    }
    return [even, odd];
}
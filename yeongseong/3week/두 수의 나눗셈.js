function solution(num1, num2) {
    // num1과 num2를 나눈 뒤 1000을 곱해준 값을 number에 저장
    const number = num1/num2*1000;
    // number의 정수 부분을 essence에 저장
    const essence = parseInt(number);
    return essence;
}
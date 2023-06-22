function solution(numbers) {
    const intnumber = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]; 
    // 영어 단어에 대응되는 숫자를 순서대로 저장하는 배열
    
   for(let i = 0; i < intnumber.length; i++) { // 각 영어 단어에 해당하는 숫자로 대체하기 위한 반복문
       numbers = numbers.split(intnumber[i]).join(i)
       // numbers 문자열에서 intnumber[i]에 해당하는 영어 단어를 분할하고 숫자로 대체해 join으로 하나의 문자열로 결합
   } 
    return Number(numbers); // 대체된 숫자 문자열을 정수로 변환해 리턴
}
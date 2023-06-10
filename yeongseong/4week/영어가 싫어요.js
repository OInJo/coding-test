function solution(numbers) {
    // 영어 단어를 해당하는 숫자로 대체하여 문자열을 변환
    numbers = numbers.replace(/zero/g, "0")
    numbers = numbers.replace(/one/g, "1")
    numbers = numbers.replace(/two/g, "2")
    numbers = numbers.replace(/three/g, "3")
    numbers = numbers.replace(/four/g, "4")
    numbers = numbers.replace(/five/g, "5")
    numbers = numbers.replace(/six/g, "6")
    numbers = numbers.replace(/seven/g, "7")
    numbers = numbers.replace(/eight/g, "8")
    numbers = numbers.replace(/nine/g, "9");
    // 변환된 문자열을 정수로 변환하여 반환
    return parseInt(numbers);
  }
  
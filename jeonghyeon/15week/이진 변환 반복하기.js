function solution(s) {
    let answer = [0, 0];
    while (s !== '1') {
        s = s.split('');
        let one = s.filter(n => n === '1').length; // 1만 뽑아서 개수 구함
        answer[0]++; // 변환 증가
        answer[1] += s.length - one; // s 숫자 개수에서 1의 개수 뺌
        s = one.toString(2); // 1의 개수를 2진수로 변환
    }
    return answer;
  }
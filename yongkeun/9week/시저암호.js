function solution(s, n) {
  let answer = "";
  s = s.split("");
  s.forEach((value) => {
    let charCode = value.charCodeAt(0);
    if (charCode >= 65 && charCode <= 90) {
      charCode = ((charCode - 65 + n) % 26) + 65;
    } else if (charCode >= 97 && charCode <= 122) {
      charCode = ((charCode - 97 + n) % 26) + 97;
    }
    answer += String.fromCharCode(charCode);
  });
  return answer;
}

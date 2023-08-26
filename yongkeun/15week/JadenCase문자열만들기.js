function solution(s) {
  s = s.split(" ");
  const answer = s.map((word) => {
    if (/^[0-9]/.test(word[0])) {
      return word.toLowerCase();
    } else if (!(word == "")) {
      return word[0].toUpperCase() + word.slice(1).toLowerCase();
    }
  });
  return answer.join(" ");
}

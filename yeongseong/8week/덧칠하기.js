function solution(n, m, section) {
    let answer = 0;
    let temp = 0;
    for (let i = 0; i < section.length; i++) {
      if (section[i] >= temp) {
        answer++;
        temp = section[i] + m;
      }
    }
    return answer;
  }
  
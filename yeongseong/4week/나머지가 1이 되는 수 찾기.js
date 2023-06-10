function solution(n) {
    for (let i = 0; i < n; i++) {
      if (n % i === 1) {
        return i; // n을 i로 나눈 나머지가 1이면 i
      }
    }
  }
  
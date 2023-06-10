function solution(n) {
  for (
    let i = 0;
    i < n;
    i++ //0부터 반복하므로 자연스럽게 가장 작은 수가 return 됨
  )
    if (n % i === 1) return i; //나머지 1이면 return
}

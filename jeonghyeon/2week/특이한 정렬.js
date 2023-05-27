function solution(numlist, n) {
    return numlist.sort((a, b) => {
    const an = Math.abs(a - n); // a와 n의 거리
    const bn = Math.abs(b - n); // b와 n의 거리
    
    if (an == bn) {
      return b - a; // 거리가 같을 때는 큰 숫자를 앞에 오도록 정렬, 양수라면 b가 a보다 큰 값으로 앞으로 정렬
    } else {
      return an - bn; // 거리가 다르면 가까운 거리를 기준으로 정렬, 음수일 경우 an 이 bn 보다 작은 값으로 an이 bn보다 앞으로 정렬
    }
  });
}
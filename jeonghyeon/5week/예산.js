function solution(d, budget) {
    let number = 0; // 지원 가능 부서 개수
    d.sort((a, b) => a - b); // 오름차순
    for (let i = 0; i < d.length; i++) {
        if (budget >= d[i]) {
          budget -= d[i]; // 예산에서 해당 부서의 신청 금액 차감
          number++; // 지원 가능한 부서 개수 증가
        } else {
          break; // 예산을 초과하면 반복 종료
        }
      }
      return number;
}
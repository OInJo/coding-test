function solution(n, lost, reserve) {
  lost.sort((a, b) => a - b);
  reserve.sort((a, b) => a - b);
  let answer = n - lost.length; //전체 학생 수 - 잃어버린 학생 수를 하여서 일단 잘 가지고 온 인원을 계산함

  for (let i = 0; i < reserve.length; i++) { //도난 당한 학생이 여분을 가지고 있을 경우 다른 인원에게 빌려주지 않고 본인의 체육복으로 사용함. 해당 로직
    const lostIndex = lost.indexOf(reserve[i]);
    if (lostIndex !== -1) {
      lost.splice(lostIndex, 1); // 도난 당한 학생과 여분을 가지고 있는 학생 번호가 같은 경우, 처리하고 lost에서 제거
      reserve.splice(i, 1); // 여분을 가지고 있는 학생 배열에서도 제거
      i--; // reserve 배열에서 학생이 제거되었으므로 인덱스 조정
      answer++;
    }
  }

  for (let i = 0; i < reserve.length; i++) { //본인의 체육복이 있는 상태에서 여분이 있는 학생이 prev, next에 잃어버린 학생이 있을 경우 빌려줌.
    const prev = reserve[i] - 1;
    const next = reserve[i] + 1;

    if (lost.includes(prev)) {
      lost.splice(lost.indexOf(prev), 1);
      answer++;
    } else if (lost.includes(next)) {
      lost.splice(lost.indexOf(next), 1);
      answer++;
    }
  }

  return answer;
}

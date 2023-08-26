function solution(name, yearning, photo) {
  var answer = [];
  for (let i = 0; i < photo.length; i++) {
    // i는 photo를 반복
    missingPoint = 0; // missingPoint를 0만큼 초기화
    for (let j = 0; j < name.length; j++) {
      // j는 name을 반복
      if (photo[i].includes(name[j])) {
        // 만약 photo 배열에 name 값이 있으면
        missingPoint += yearning[j]; // 현재 j index의 yearning을 plus
      }
    }
    answer.push(missingPoint); // missingPoint 를 answer에 push
  }
  return answer;
}

function solution(s) {
  var answer = [];
  let seen = {}; // 객체를 사용하여 문자의 위치 정보 저장
  for (let i = 0; i < s.length; i++) {
    if (seen.hasOwnProperty(s[i])) {
      // key : value에서 s[i]라는 key 가 있는지 확인
      answer.push(i - seen[s[i]]); // 있으면 현재 인덱스 - 찾은 것의 인덱스를 해서 차이를 넣음
    } else {
      answer.push(-1);
    }
    seen[s[i]] = i; // 똑같은 값이 2번 들어오면 새로운 i로 업데이트함으로써, 같은 값이 두 번 들어있을 경우 가장 가까운 사람을 찾게 됨
  }
  return answer;
}

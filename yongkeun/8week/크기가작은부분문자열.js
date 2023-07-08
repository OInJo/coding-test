function solution(t, p) {
  answer = [];
  count = 0;
  t = t.split(""); //배열로 바꾸고
  for (let i = 0; i <= t.length - p.length; i++) {
    //p의 길이가 3이고 t가 123456이면 123 234 345 456을 배열에 푸시
    answer.push(t.slice(i, i + p.length).join(""));
  }
  answer.forEach((value) => {
    if (value <= p)
      //배열의 값이 p보다 작거나 같으면 count 더함
      count++;
  });
  return count;
}

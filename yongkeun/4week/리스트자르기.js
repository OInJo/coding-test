function solution(n, slicer, num_list) {
  if (n === 1) {
    return num_list.slice(0, slicer[1] + 1); //0번 인덱스부터 b번 인덱스까지 추출하여 리턴
  } else if (n === 2) {
    return num_list.slice(slicer[0], num_list.length + 1);
  } else if (n === 3) {
    return num_list.slice(slicer[0], slicer[1] + 1);
  } else if (n === 4) {
    let answer = []; //새 배열을 만들고
    for (let i = slicer[0]; i < slicer[1] + 1; i += slicer[2]) {
      // slicer[2] 만큼의 간격을 줌
      answer.push(num_list[i]);
    }
    return answer;
  }
}

function solution(n, slicer, num_list) {
    var answer = [];
    let a = slicer[0];  
    let b = slicer[1];  
    let c = slicer[2];  
    if (n === 1) {
      // 0번 인덱스부터 b번 인덱스까지
      for (let i = 0; i <= b; i++) {
        answer.push(num_list[i]);
      }
    } else if (n === 2) {
      // a번 인덱스부터 마지막 인덱스까지
      for (let i = a; i < num_list.length; i++) {
        answer.push(num_list[i]);
      }
    } else if (n === 3) {
      // a번 인덱스부터 b번 인덱스까지
      for (let i = a; i <= b; i++) {
        answer.push(num_list[i]);
      }
    } else if (n === 4) {
      // a번 인덱스부터 b번 인덱스까지 c간격으로
      for (let i = a; i <= b; i += c) {
        answer.push(num_list[i]);
      }
    }
    return answer; 
  }
  
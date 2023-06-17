function solution(sizes) {
    let maxList = []; 
    let minList = []; 
    
    for (let i = 0; i < sizes.length; i++) {
      const [width, height] = sizes[i];
      // 너비와 높이 중에서 최대값과 최소값을 구함
      const max = Math.max(width, height);
      const min = Math.min(width, height);
      maxList.push(max);
      minList.push(min);
    }
    // maxList 배열에서 가장 큰 값 구함
    const maxListNum = Math.max(...maxList);
    // minList 배열에서 가장 큰 값 구함
    const minListNum = Math.max(...minList);
    return maxListNum * minListNum;
  }
  
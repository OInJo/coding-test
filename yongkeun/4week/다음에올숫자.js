function solution(common) {
  if (common[2] - common[1] === common[1] - common[0]) {
    //등차수열이라면
    return common[common.length - 1] + (common[2] - common[1]); //마지막배열+공차
  } else {
    //등비수열이라면
    return common[common.length - 1] * (common[2] / common[1]); //마지막배열*공비
  }
}

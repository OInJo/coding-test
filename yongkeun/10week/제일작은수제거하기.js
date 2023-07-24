function solution(arr) {
  if (arr.length > 1) {
    min = Math.min(...arr);
    minIndex = arr.indexOf(min);
    arr.splice(minIndex, 1);
    return arr;
  } else {
    return [-1];
  }
}

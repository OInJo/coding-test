function solution(arr) {
  let twoIndexArray = []; //2의 index를 담을 배열
  arr.forEach((value, index) => {
    if (value === 2) {
      //arr의 값이 2면
      twoIndexArray.push(index); //2가 있는 곳의 인덱스 값을 담음
    }
  });
  var start = twoIndexArray[0]; //2가 있는 곳의 인덱스를 담은 배열의 첫번째가 2가 처음 나오는 부분이 됨
  var end = twoIndexArray[twoIndexArray.length - 1]; //.length-1을 통해 배열의 마지막을 가져옴
  if (start == undefined) {
    //만약 2가 하나도 없다면
    return [-1];
  } else {
    return arr.slice(start, end + 1); //slice를 이용해 배열의 start부터 end까지 리턴
  }
}

function solution(sizes) {
  //배열을 내림차순으로 정렬하여 sortSizes에 넣음(높은 값이 앞으로)
  //sortSizes의 0번 인덱스의 max 값과, 1번 index의 max 값을 곱함
  sortSizes = [];
  wArray = [];
  hArray = [];
  for (let i = 0; i < sizes.length; i++) {
    sorted = sizes[i].sort((a, b) => b - a); //sizes 배열을 내림차순 정렬하여
    sortSizes.push(sorted); //sortSizes 배열에 담음, 높은 값이 앞으로 옴
  }
  for (let j = 0; j < sortSizes.length; j++) {
    wArray.push(sortSizes[j][0]); //각 배열 중에 높은 값들만 뽑아내(높은 값은 앞전에 정렬했으므로 0번 인덱스에 있음) wArray에 push
    hArray.push(sortSizes[j][1]); //각 배열 중에 낮은 값들만 뽑아내(낮은 값은 앞전에 정렬했으므로 1번 인덱스에 있음) hArray에 push
  }
  wMax = Math.max.apply(null, wArray); //wArray 중에 max 값 추출, 배열에서 max 값을 추출하기 위해서는 Math.max.apply 사용, 첫 번째 매개변수 null은 this 값을 사용하지 않겠다는 의미
  hMax = Math.max.apply(null, hArray);
  return wMax * hMax;
}

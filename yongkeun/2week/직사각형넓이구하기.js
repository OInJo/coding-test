function solution(dots) {
  var xValue = [] //x값을 담을 배열
  let xMin = 0; //x의 최솟값을 담을 변수
  let xMax = 0; //x의 최댓값을 담을 변수
  let x = 0; //그래서 만들어낼 x의 길이
  var yValue = []
  let yMin = 0;
  let yMax = 0;
  let y = 0;
  for(let i=0; i<=3; i++){ //4칸이므로 4번 반복함
      xValue.push(dots[i][0]) //xValue에다가 x값을 차곡차곡 쌓음
      xMin = Math.min(...xValue) //최솟값 구함
      xMax = Math.max(...xValue) //최댓값 구함
      yValue.push(dots[i][1])
      yMin = Math.min(...yValue);
      yMax = Math.max(...yValue);
  }
  for(xMin; xMin<xMax; xMin++){
      x++; //길이만큼 더함, x축의 길이를 구함
  }
  for(yMin; yMin<yMax; yMin++){
      y++
  }
  return x*y //x축의 길이 * y축의 길이
}
function solution(n) {
  //n으로 나눴을 때 나머지가 없으면 인수
  //약수의 갯수가 2개면 소수
  //두 조건 다 충족하면 소인수
  var insu = []
  let yaksucount = 0;
  var soinsu = []
  for(let i=0; i<=n; i++){
      if(n % i == 0){ //나눴을 때 나머지가 없으면 인수임
          insu.push(i) //인수만 담기
      }
  }
  // 약수의 개수가 1, 2개면 소수다, 1과 본인
  insu.forEach((value)=>{
      for(let j=1; j<=value; j++){
          if(value % j == 0){ // 
              yaksucount++;
          }
      }
      if(yaksucount == 2) { // 약수의 개수가 2개이면
          soinsu.push(value) //소인수인 것으로 판정
      }
      yaksucount = 0; //약수 개수 초기화
  })
  return soinsu;
}
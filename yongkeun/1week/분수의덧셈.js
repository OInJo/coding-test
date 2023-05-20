function solution(numer1, denom1, numer2, denom2) {
  var boonja = numer1 * denom2 + denom1 * numer2; //분자를 구하는 공식
  var boonmo = denom1 * denom2; //분모를 구하는 공식
  let max = Math.max(boonja, boonmo); //분자와 분모 중 더 높은 값을 max에 할당
  for (let i = max; i <= max; i--) {
    //i는 max로 시작하여, max보다 작을때까지 실행됨
    if (boonja % i == 0 && boonmo % i == 0) {
      //분자와 분모가 모두 나누어떨어지면 최대공약수
      return [boonja / i, boonmo / i]; //최대공약수로 나누어서 반환
    }
  }
}

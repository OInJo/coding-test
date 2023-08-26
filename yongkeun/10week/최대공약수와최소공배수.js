function solution(n, m) {
  //최대공약수(n과 m을 동시에 나누어떨어뜨릴 수 있는 수 중에 가장 큰 수) 구하는 함수 gcd
  function gcd(a, b) {
    if (b === 0) {
      //b가 0이 될때까지 반복
      return a;
    }
    return gcd(b, a % b); //b와 b 나누기 a의 나머지로 다시 최대공약수 함수를 호출함
  }
  //최소공배수(n과 m의 공통 배수 중 가장 작은 수) 구하는 함수
  function lcm(a, b) {
    const gcdResult = gcd(a, b); //최대공약수를 구하고
    return (a * b) / gcdResult; //곱한 후에 최대공약수랑 나눔
  }
  gcdNum = gcd(n, m);
  lcmNum = lcm(n, m);
  return [gcdNum, lcmNum];
}

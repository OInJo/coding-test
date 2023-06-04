function solution(a, b) {
  let commonDivisor = 0; //최대공약수를 담을 변수
  for (let i = 1; i < b; i++) {
    //b까지 돌아서
    if (a % i == 0 && b % i == 0) {
      //a, b로 둘다 나눠지는지, 나눠지면 공약수인데 for문이 오름차순으로 진행되므로 자연스럽게 최대공약수가 들어감
      commonDivisor = i; //값을 넣음
    }
  }
  b = b / commonDivisor; //기약분수로 나타내었을 때 분모값이 들어감, 이제 이 분모값의 소인수가 2와 5만 존재하는지 체크하면 됨
  //체크하는 방법은 2와 5로 안나눠질때까지 계속 나누고, 나눈 값이 1이 되지 않으면 무한소수라고 함
  while (b % 2 == 0) {
    b = b / 2;
  }
  while (b % 5 == 0) {
    b = b / 5;
  }

  return b == 1 ? 1 : 2;
}

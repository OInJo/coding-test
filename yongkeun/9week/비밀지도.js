function solution(n, arr1, arr2) {
  var passwordArray = [];
  for (let i = 0; i < n; i++) {
    let password = ""; //패스워드가 있으면 #, 아니면 공백을 담을 변수
    binary1 = arr1[i].toString(2).padStart(n, 0).split(""); //toString(2)으로 2진수로 바꾸어주고, padStart를 이용하여 자릿수가 부족하면 앞부터 0으로 채워줌
    binary2 = arr2[i].toString(2).padStart(n, 0).split("");
    for (let j = 0; j < n; j++) {
      if (binary1[j] == 1 || binary2[j] == 1) {
        //만약 둘중 하나라도 1이면
        password += "#"; //password에는 #이 추가됨
      } else {
        //아니면 공백
        password += " ";
      }
    }
    passwordArray.push(password); //한 배열의 패스워드값을 구했으므로 푸시함
  }

  return passwordArray;
}

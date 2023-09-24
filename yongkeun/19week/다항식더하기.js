function solution(polynomial) {
  let xValue = 0; //x의 값이 몇인지 저장할 변수
  let plusValue = 0; //숫자 값이 몇인지 저장할 변수

  polynomial = polynomial.split(" ");

  for (let i = 0; i < polynomial.length; i++) {
    if (polynomial[i].includes("x")) { //항이 x를 포함하는지?
      if (polynomial[i].length > 1) { //포함하면서 길이가 1을 넘는다는 것은 x가 아니고 1x, 2x 등의 숫자라는 의미
        xValue += parseInt(polynomial[i].slice(0, -1)); //x를 제외한 숫자만 가져와서 xValue에 더함
      } else { //아니면 그냥 1 더함
        xValue++;
      }
    } else if (/^[0-9]+$/.test(polynomial[i])) { //이번엔 항이 숫자로만 이루어져있는지 체크, 1, 2 등
      plusValue += parseInt(polynomial[i]); // plusValue에 값을 더함 
    }
  }

  let returnString = ""; //리턴문장을 구성하기위한 변수 지정

  if (xValue !== 0) { //만약 xValue 값이 있다면?
    if (xValue === 1) returnString += "x"; //있는데 1이면 1x가 아니고 x로 리턴해야하므로 if문 추가
    else returnString += `${xValue}x`;
    if (plusValue !== 0) { //만약 xValue도 있고 plusValue 값도 있다면?
      returnString += ` + ${plusValue}`; // 값을 추가하는데 띄어쓰기와 + 기호를 추가해서 넣음
    }
  } else if (plusValue !== 0) { //xValue는 없고 plusValue만 있다면
    returnString += `${plusValue}`; //그냥 추가
  }

  return returnString;
}

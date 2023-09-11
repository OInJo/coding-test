function solution(progresses, speeds) {
  let dayArray = [];
  let day;
  let answer = [];

  for (let i = 0; i < progresses.length; i++) {
    day = 0;

    while (progresses[i] < 100) {
      progresses[i] += speeds[i];
      day++;
    }

    dayArray.push(day);
  }

  let maxDay = dayArray[0];
  let count = 1;

  for (let i = 1; i < dayArray.length; i++) {
    if (dayArray[i] <= maxDay) {
      count++;
    } else {
      answer.push(count);
      count = 1;
      maxDay = dayArray[i];
    }
  }

  answer.push(count);

  return answer;
}

function solution(num, total) {
  var answer = [];
  var mid = parseInt(total / num);
  var half = parseInt(num / 2);
  var top = mid + half + 1;
  var bot = top - num;
  for (let i = bot; bot < top; bot++) {
    answer.push(bot);
  }
  return answer;
}

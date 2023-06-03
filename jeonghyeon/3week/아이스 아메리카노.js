function solution(money) {
    var answer = [];
    answer[0] = parseInt(money / 5500); // 나눈 값의 정수 부분만 추출해 배열에 넣음
    answer[1] = money % 5500; // 남는 돈은 나머지로 구해서 배열에 넣음
    return answer;
}
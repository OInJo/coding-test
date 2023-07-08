function solution(nums) {
  nums = nums.sort((a, b) => a - b); //오름차순 정렬
  count = 1; //처음에 nums[0]을 넣고 시작하므로 count 1부터 시작
  prev = nums[0];
  for (let i = 1; i < nums.length; i++) {
    if (prev !== nums[i]) {
      //이전 값과 현재 값이 같지 않으면 중복이 아니므로
      count++; //갯수를 하나 늘림
    }
    prev = nums[i]; //if 블록 바깥에서 무조건 이전 값을 prev에 넣어줌
  }
  return nums.length / 2 < count ? nums.length / 2 : count; //골라야 하는 폰켓몬의 갯수가 count보다 작으면 그냥 폰켓몬의 갯수를 리턴함
}

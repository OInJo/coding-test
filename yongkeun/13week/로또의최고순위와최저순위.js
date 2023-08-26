function solution(lottos, win_nums) {
  const zeroCount = lottos.filter((element) => element === 0).length;
  const hit = lottos.filter((lotto) => win_nums.includes(lotto)).length;

  const ranks = [6, 6, 5, 4, 3, 2, 1];
  const best = ranks[hit + zeroCount];
  const worst = ranks[hit];

  return [best, worst];
}

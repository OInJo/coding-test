function solution(nums) { // 폰켓몬 종류 개수를 구하는 문제(가질 수 있는 최대의 종류 수)
    const choosenum = nums.length / 2; // 가져갈 폰켓몬 수 총 4마리 => 2마리
    const eachkind = [...new Set(nums)]; // 중복 제거한 폰켓몬 종류 수 [3,1,2]
    // 3개의 종류가 있으니 2개 뽑아가면 됨
    // 가져갈 폰켓몬 수 < 중복 제거 폰켓몬 종류 수 => 가져갈 폰켓몬 수
    if(choosenum < eachkind.length) {
        return choosenum;
    } else {
        return eachkind.length;
    }
}
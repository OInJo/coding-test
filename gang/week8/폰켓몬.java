import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;   // 선택 마리
        HashSet<Integer> result = new HashSet<>();  // 중복 제거

        for(int i=0; i< nums.length; i++) { // 중복된 값을 제외하고 값을 넣음
            result.add(nums[i]);
        }

        return Math.min(result.size(), answer);     // 둘 중에 작은 수가 가장 많은 수 선택
    }
}
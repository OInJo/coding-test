import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        
        return set.size() < answer ? set.size() : answer;
    }
}
// 결국 폰켓몬 최댓값은 nums 배열의 절반, 중복을 제거한 뒤 나오는 숫자들과 비교하여 값 도출
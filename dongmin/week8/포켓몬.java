import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> deduplication = new HashSet<>();
        for(int num : nums)
            deduplication.add(num);
        return nums.length/2<deduplication.size()?nums.length/2:deduplication.size();
    }
}
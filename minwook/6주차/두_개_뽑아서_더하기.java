import java.util.HashSet;
import java.util.Set;

class Solution {
     public int[] solution(int[] numbers) {
        HashSet<Integer> num = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                num.add(numbers[i] + numbers[j]);
            }
        }

        return num.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
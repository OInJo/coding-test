import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int num = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : tangerine){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2) - map.get(o1));
        
        while(k > 0){
            k -= map.get(list.get(num));
            answer++;
            num++;
        }
        return answer;
    }
}
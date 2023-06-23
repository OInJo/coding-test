import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        int n = arr[0];
        for(int i=0; i<arr.length; i++){
            if(n == arr[i]){
                n = arr[i];
                continue;
            }
            list.add(arr[i]);
            n = arr[i];
        }
        
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();

        return array;
    }
}
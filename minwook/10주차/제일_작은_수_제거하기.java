import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] a = {-1};
        int min = arr[0];
        List<Integer> arrList = new ArrayList<>();
        for(int n : arr){
            min = Math.min(n,min);
        }
        for(int i=0; i<arr.length; i++){
            if(min != arr[i])
                arrList.add(arr[i]);
        }
        int[] answer = arrList.stream().mapToInt(x -> x).toArray();
        if(answer.length == 0)
            return a;
    
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = 100;
        int progress = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<progresses.length; i++){
            progress = n - progresses[i];
            int b = 0;
            while(progress > 0){
                progress -= speeds[i];
                b++;
            }
            queue.add(b);
        }
        while(queue.size() > 0){
            int q = 0;
            int a = 0;
            q = queue.peek();
            if(queue.peek() != null){
                while(q >= queue.peek()){
                a++;
                queue.remove();
                if(queue.peek() == null)
                    break;
                }
            }
            list.add(a);
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}
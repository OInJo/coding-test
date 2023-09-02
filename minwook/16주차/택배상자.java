import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int a = 0;
        int currentBox = 1;
        Stack<Integer> assistanceBelt = new Stack<>();
        while(a < order.length){
            if(order[a] > currentBox){
                assistanceBelt.push(currentBox);
                currentBox++;
            }
            else if(order[a] == currentBox){
                answer++;
                a++;
                currentBox++;
            }
            else{
                while(!assistanceBelt.isEmpty() && order[a] == assistanceBelt.peek()){
                    assistanceBelt.pop();
                    answer++;
                    a++;
                }
                if (a >= order.length || order[a] < currentBox) 
                    break;
            }
        }
        return answer;
    }
}

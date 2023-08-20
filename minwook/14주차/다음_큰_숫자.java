import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=n+1; ;i++){
            if(num(n) == num(i)){
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    public int num(int n){
        int answer = 0;
        while(n > 0){
            if(n%2 == 1)
                answer++;
            n /= 2;
        }
        return answer;
    }
}


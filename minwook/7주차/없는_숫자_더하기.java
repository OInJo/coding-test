import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        for(int n : numbers){
                if(Arrays.stream(numArr).anyMatch(i -> i == n)){ // 숫자 존재할 경우 다 0으로 치환
                    numArr[n] = 0;
                }
        }
        for(int n : numArr){
            answer += n;
        }
        return answer;
    }
}
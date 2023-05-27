/*
예를 들어 numlist 값이 1,2,3,4,5,6이고 n이 4일 경우
n만큼의 값을 빼줌. 하지만 음수일 경우에는 소수점을 더하고 절대 값을 씌워
3.1, 2.1, 1.1, 0, 1, 2, 3의 형태로 나타나게하여 큰 값이 먼저 올 수 있게 하고
오름차순 정렬을 통해 값을 정렬시킴  
*/
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {

        int[] answer = new int [numlist.length];
        double[] result = new double[numlist.length];   //음수가 나올 경우 소수점까지 나타낼수 있는 double 형 배열을 만듦.
        for (int i = 0; i < numlist.length; i++) {
            result[i] = (double) numlist[i];        
            if (result[i] - n < 0)  //음수일 경우
                result[i] = Math.abs(result[i] - n)+ 0.1;   //값이 음수이면 0.1을 더함
            else
                result[i] = numlist[i] - n;
        }

        Arrays.sort(result);
        for (int i = 0; i < numlist.length; i++) {
            if(result[i]%1==0)  //1로 나누어 나머지가 0이면 양수아니면 음수
                answer[i] = (int) result[i]+n;
            else
                answer[i] = n-(int) result[i];

        }
        return answer;
    }
}
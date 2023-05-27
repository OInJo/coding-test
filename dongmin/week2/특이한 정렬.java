import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {

        int[] answer = new int [numlist.length];
        double[] result = new double[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            result[i] = (double) numlist[i];
            if (result[i] - n < 0)  //음수
                result[i] = Math.abs(result[i] - n)+ 0.1;
            else
                result[i] = numlist[i] - n;
        }

        Arrays.sort(result);
        for (int i = 0; i < numlist.length; i++) {
            if(result[i]%1==0)
                answer[i] = (int) result[i]+n;
            else
                answer[i] = n-(int) result[i];

        }
        return answer;
    }
}
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length-2; i++) {
            for (int j = 1 + i; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if((number[i]+number[k]+number[j]) == 0)
                        answer++;
                }
            }
        }



        return answer;
    }
}
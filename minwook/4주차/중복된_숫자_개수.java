class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i : array){
            if(i==n) // array에 n과 같은 숫자가 있으면 answer 값 +1
                answer++;
        }
        return answer;
    }
}
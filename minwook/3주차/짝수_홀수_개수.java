class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2]; // 짝수, 홀수 배열 공간
        for(int n : num_list){ // 배열 값 전부 접근
            if(n%2 == 0) // 짝수일 경우
                answer[0]++;
            else // 홀수일 경우
                answer[1]++;
        }
        return answer;
    }
}
class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++){
            answer += a[i] * b[i]; // a, b의 첫번째 인덱스 곱의 합
        }
        return answer;
    }
}
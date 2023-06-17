class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int div;
        for (int i = 0; i < a.length; i++) {
            div = a[i]*b[i];
            answer+=div;
        }
        return answer;
    }
}
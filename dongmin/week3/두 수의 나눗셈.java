class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double result =0;
        result =(double)num1/(double)num2;  //double 형으로 연산
        result*=1000;
        answer = (int)result;

        return answer;
    }
}
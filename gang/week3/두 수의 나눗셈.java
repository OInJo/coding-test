class Solution {
    public int solution(int num1, int num2) {
        double result = (double) num1/num2*1000;        //나눈 값이 다 필요하기 때문에 double형으로 출력
        return (int) result;    //double형을 int형으로 변환
    }
}
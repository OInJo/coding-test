class Solution {
    public int solution(int num1, int num2) {
        return (int)((float)num1 / (float)num2 * 1000); 
    }
} // float 형으로 적은 메모리로 num1, num2 형변환 나누고 1000을 곱한 뒤, 정수로 형변환
class Solution {
    public int solution(int order) {
        int answer = 0;
        while (order != 0) {
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) 
            answer++; // 자릿수 별로 나눈값이 3 6 9 일 경우 값 추가
            order /= 10; // 그리고 자릿수 제거
        }
        return answer;
    }
}
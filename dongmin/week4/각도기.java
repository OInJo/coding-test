class Solution {
    public int solution(int angle) {
        return angle==180?4:angle<90?1:angle==90?2:3;   //삼항 연산자를 사용해 한줄로 표현
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 6; ; i+=6) {    //피자 한판이 6조각이므로 6조각씩 증가
            if(i%n ==0) {   // 피자 조각을 인원으로 나누어 맞아 떨어지면
                answer = i / 6; //피자 판의 갯수를 구하는 것이기 때문에 나누기 6으로 판 개수를 구함
                break;
            }
        }
        return answer;
    }
}
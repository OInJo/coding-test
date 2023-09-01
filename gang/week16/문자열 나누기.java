class Solution {
    public int solution(String s) {
        int answer = 0;
        char f = s.charAt(0);   // 첫번째 문자 지정
        int x = 1;  // x는 처음부터 정해져 있으니 1로 시작
        int rX = 0;
        for(int i=1; i < s.length(); i++) {
            if(s.charAt(i) == f) {  // 문자가 같으면 x 증가
                x++;
            }
            else {  // 다르면 rX증가
                rX++;
            }
            if(x == rX) {   // 두개가 같아지면
                answer++;   // answer 증가
                if (i + 1 < s.length()) {   // 범위를 벗어나지 않으면
                    f = s.charAt(i + 1);    // 처음 문자 다시 지정
                }
                x = 0;  // 이 횟수도 초기화
                rX = 0;
            }
        }
        if(x != rX) {   // 반복문을 다 돌렸는데 같지 않으면 나머지도 문자열이 되기 때문에 answer 증가
            answer++;
        }
        return answer;
    }
}
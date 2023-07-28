class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a) {
            n -= a;     // 전체 빈병에서 교환할 병수 제외
            answer += b;    // 교환된 병 수 만큼 총 교환 병 수 추가
            n += b; // 추가된 병 수를 다시 전체 빈병 수에 추가
        }
        return answer;
    }
}
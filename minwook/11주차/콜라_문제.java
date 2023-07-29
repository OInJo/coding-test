class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remain = 0;
        while(true){
            if(n<a)
                break;
            answer += (n/a) * b;
            remain = n%a;
            n = remain + (n/a) * b;
        }
        return answer;
    }
}

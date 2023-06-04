class Solution {
    public int solution(int a, int b) {
        int answer=0;
        for (int i = 2; i < Math.max(a, b); i++) {
            if(a%i==0&&b%i==0){     //a와 b로 나누어 떨어지는 값이 있을 때 그 값으로 a,b를 나눔
                a/=i; b/=i;
            }
        }
        while (b %2==0 || b%5==0) {
            if (b % 2 == 0)
                b /= 2;
            if (b % 5 == 0)
                b /= 5;
            
        }

        answer=b==1?1:2;
        return answer;
    }
}
public class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        int digit = 0;
        
        for(int i=10; i<=n; i*=10){ // i * 10으로 나눈 나머지 값 계속 덧셈 (첫번째 수는 덧셈 x)
            num = n%i; 
            n -= num;
            while(num>=10) // 자릿수 값을 위해 10보다 크거나 같을 경우 나누기
                num/=10;
            answer += num;
            digit++; // 자릿수 확인을 위한 숫자
        }

        return answer + n/(int)Math.pow(10,digit); // n의 첫번째 수 덧셈
    }
}

// while문을 사용하면 더 간단하게 작성 가능
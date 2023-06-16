class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int n=left; n<=right; n++){
            if(measureEvenOdd(n) % 2 == 0) // 짝수, 홀수 구분
                answer += n;
            else
                answer -= n;
        }
        return answer;
    }
    
    public int measureEvenOdd(int num){ // 약수 구하기
        int evenOdd = 0;
        for(int i=1; i<=num; i++){
            if(num % i == 0)
                evenOdd++;
        }
        return evenOdd;
    }
}
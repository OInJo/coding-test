class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2]; // 분자와 분모 넣을 공간 정적 배열로 선언
        numer1 *= denom2; 
        numer2 = numer2 * denom1 + numer1; // 부모 공배수에 맞춰 분자 곱셈
        denom1 *= denom2; // 분모 공배수
        for (int i = denom1; i>0; i--){
            if ((numer2 % i == 0) && (denom1 % i == 0)){ // 최대 공약수를 찾은 뒤 계산
                answer[0] = numer2 / i; 
                answer[1] = denom1 / i;
                break;
            }
        }
        return answer;
    }
}
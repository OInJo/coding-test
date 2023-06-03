class Solution {
    public int solution(int a, int b) {
        int gcd = 1;    // 최대공약수를 1로 선언
        int min = Math.min(a,b);    // 분자와 분모중 더 작은수를 구함
        for(int i=1; i<= min; i++) {    // 반복문을 통해 분자와 분모의 최대공약수를 구함
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        int gcdB = b / gcd;     // 분모를 최대공약수로 나눠 기약분수의 분모로 만듦
        while(gcdB % 2 == 0 ) { // 분모의 소인수 중 2가 있는지 확인
            gcdB /=  2;
        }
        while(gcdB % 5 == 0) {  // 분모의 소인수 중 2가 있는지 확인
            gcdB /= 5;
        }

        if(gcdB == 1) { // 2나 5가 있으면 최종적으로 분모는 1이 되기 때문에 그런 경우 1 리턴
            return 1;
        }
        else {  // 아닌 경우 유한소수가 아니므로 2 리턴
            return 2;
        }
    }
}
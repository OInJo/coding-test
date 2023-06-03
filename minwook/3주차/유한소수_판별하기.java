class Solution {
    public int solution(int a, int b) {
        int common = 1;
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) 
                common = i; // 최대 공약수
        }
        b = b / common; // 기약 분수 분모
        while (b % 2 == 0) // 소인수 2가 존재하는 경우
            b = b / 2; // 없을 떄까지 나눔
        while (b % 5 == 0) // 소인수 5가 존재하는 경우
            b = b / 5; 
        return b == 1 ? 1 : 2; // 1일 경우 유한소수 아니면 무한소수
    }
}
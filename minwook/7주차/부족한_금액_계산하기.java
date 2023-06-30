class Solution {
    public long solution(int price, int money, int count) {
        long p = 0; // int 사용 시 오버플로우
        int n = 1;
        for(int i=count; i>0; i--){
            p += price * n;
            n++;
        }
        p -= money;
        return p >= 0 ? p : 0;
    }
}
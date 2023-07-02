class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice=0;
        for (int i = 1; i <= count; i++) {
            totalPrice+=price*i;        //총합 가격을 곱해서
        }
        return money>=totalPrice?0:totalPrice-money;        //return
    }
}
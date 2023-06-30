class Solution {
    public int solution(int num) {
        int n = 0;
        while(num != 1){
            if(num % 2 == 0)
                num = num / 2; 
            else if(num % 2 == 1)
                num = num * 3 + 1;
            n++;
            if(n>499){
                n = -1;
                break;
            }
        }
        return n;
    }
}
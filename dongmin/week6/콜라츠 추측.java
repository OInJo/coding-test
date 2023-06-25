class Solution {
    public int solution(int num) {

        long num1= (long) num;      //int형이 표현할 수 있는 범위를 넘기 때문에 long형으로 선언
        for(int i=0;i<500;i++) {            //i를 500번 반복하고 그 안에 num1이 1이 되면 반복한 횟수를 리턴함
            if(num1==1)     
                return i;
            num1=(num1%2==0)?num1/2:num1*3+1;
        }

        return -1;          //500번 반복했는데도 안될 경우 -1 리턴
    }
}
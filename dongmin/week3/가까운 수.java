/*특이한 정렬과 비슷한 문제같아 보여 특이한 정렬을 응용해서 풀어봤는데
다른 사람의 풀이 방법을 보니 훨씬 간단하게 풀 수 있는 문제였다. 
먼저 array를 오름 차순 정렬한 후 각각 정수 n값 을 뺀 후 절대 값을 붙여
그 크기가 0에 더 가까운 수를 0번째 인덱스에 위치하게 한 뒤 0번째 인덱스 값을
return하면 쉽게 풀 수 있었다
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        double []result=new double[array.length];   //array 배열이 n보다 클 경우 소수점을 받기 위해 double형으로 선언
        int k=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > n)       
                result[i]=array[i]-n+0.1;
            else
                result[i]=Math.abs(array[i]-n);     //값이 n보다 작으면 계산 후 절대값을 씌운다.
        }

        Arrays.sort(result);    //오름차순 정렬
        if(result[0]%1==0)      //n이 더 클 때
            array[0]=n-(int)result[0];
        else
            array[0]=(int)result[0]+n;
        answer=array[0];
        return array[0];
    }
}
class Solution {
    public int[] solution(int[] numlist, int n) {

        for(int i = 0; i< numlist.length -1; i++) {     //두 배열의 값을 비교하는 반복문
            for(int j = i+1; j<numlist.length; j++) {
                int dist1 = Math.abs(numlist[i] - n);   //배열의 값과 기준값의 거리 Math.abs사용하여 절대값으로 표현
                int dist2 = Math.abs(numlist[j] - n);
                if(dist1 > dist2 || (dist1==dist2 && numlist[i] < numlist[j])) {
                    //두번째 값의 거리가 더 짧거나 거리가 같이도 값이 더 큰 경우 배열의 위치 이동
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        return numlist;
    }
}
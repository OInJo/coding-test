class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];        //answer에 크기는 num에 값임

        int startNum=total/num-(num-1)/2;   // 시작 순서를 구한다. total/num으로 중간 값을 구하고 num/2의 값을 빼주면 초기값을 구할 수 있다.
                                            // num-1을 하는 이유는 num이 짝수일 경우 결과가 나오지 않게 되기 때문
        for (int i = 0; i < num; i++) {     //num에 크기만큼 i를 반복함.
            answer[i]=startNum+i;           //i가 1씩 증가하므로 시작 값에 1을 더하고 그 값을 순차적으로 배열 answer에 넣어줌
        }

        return answer;
    }
}
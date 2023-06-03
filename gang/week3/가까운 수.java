class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];  // 배열의 첫번째 값을 초기값으로 지정

        for (int i = 1; i < array.length; i++) {
            int dist1 = Math.abs(answer - n);   //Math.abs함수로 n과의 거리를 절대값으로 구함
            int dist2 = Math.abs(array[i] - n);

            //거리를 구해서 더 가까운쪽, 거리가 같으면 크기가 더 작은쪽을 answer에 대입
            if (dist2 < dist1 || (dist1 == dist2 && array[i] < answer)) {
                answer = array[i];
            }
        }
        return answer;
    }
}

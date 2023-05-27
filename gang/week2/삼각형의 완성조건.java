class Solution {
    public int solution(int[] sides) {

        int minLength = Math.abs(sides[0] - sides[1]) + 1;  //두 변중 더 긴 변을 모르기 때문에 Math.abs로 두 변 길이의 차이에 1을 더함
                                                            //이 값은 나머지 한 변의 최소 길이
        int maxLength = sides[0] + side[1] - 1; //나머지 한 변의 최대 길이

        return maxLength - minLength + 1;   //갯수를 구하는 것이기 때문에 최대 길이에서 최소 길이를 뺀 후 +1
    }
}
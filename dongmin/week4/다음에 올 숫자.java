class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if ((common[1] - common[0]) == (common[2] - common[1])) {     //두번째 항에서 첫번재 항을 뺀 값과 
                                                                      //세번째 항에서 두번째 값을 뺀 값이 같으면 등차 수열
            answer = common[common.length - 1] + common[1] - common[0];
        } else if ((common[1] / common[0]) == (common[2] / common[1])) {    //두번째 항에서 첫번재 항을 나눈 값과 
                                                                      //세번째 항에서 두번째 값을 나눈 값이 같으면 등비 수열
            answer = common[common.length - 1] * common[1]/common[0];   
        }
        return answer;
    }
}
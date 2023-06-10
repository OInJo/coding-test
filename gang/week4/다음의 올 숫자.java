class Solution {
    public int solution(int[] common) {
        int num = 0;    // 배율이나 차이를 담을 변수
        if(common[0] != 0 && common[1] != 0) {  // 등비수열의 경우 0이 올수 없으니 확인
            if(common[1] % common[0] == 0 && common[2] % common[1] == 0) {  // 등비수열인지 확인
                num = common[1] / common[0];
                return common[common.length - 1] * num;
            }
            else {      // 등비수열이 아니면 등차수열
                num = common[1] - common[0];
                return common[common.length - 1] + num;
            }
        }
        else {      // 배열에 0이 있으면 등차수열임
            num = common[1] - common[0];
            return common[common.length - 1] + num;
        }
    }
}
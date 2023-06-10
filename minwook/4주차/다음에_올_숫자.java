class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int subtract = common[1] - common[0]; 
        if(subtract == common[2] - common[1]){ // 등차수열인 경우
            answer = common[0] + (common.length) * subtract;
        } else { // 등비수열인 경우
            answer = (int) Math.pow(common[1]/common[0],common.length) * common[0]; // Math.pow로 r에 항만큼 제곱 * a
        }
        return answer;
    }
}
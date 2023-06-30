class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    answer += decimal(nums[i]+nums[j]+nums[k]);
                } 
            }
        }
        return answer;
    }
    
    public int decimal(int n){ // 소수 판별 함수 소수면 1 아니면 0
        for(int i=2; i<n; i++){
            if(n%i==0)
                return 0;
        }
        return 1;
    }
}
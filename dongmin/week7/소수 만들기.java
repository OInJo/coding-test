import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int num=0;
        int count=0;
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {       //삼총사 응용 소스로 인덱스들을 nums에 세가지 인덱스를 구해서

            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    num=nums[i]+nums[j]+nums[k];
                    numList.add(num);                   // 나올 수 있는 경우의 수를 numList에 더함
                }
            }
        }

        for (int i = 0; i < numList.size(); i++) {          //소수인지를 판별하는 부분
            for (int j = 2; j <= numList.get(i); j++) {
                if(numList.get(i)%j==0)
                    count++;        //count가 하나이면 1과 자기 자신을 포함하는 것이므로 소수이다.
            }
            if(count == 1)
                answer++;
            count = 0;
        }

        return answer;
    }
}
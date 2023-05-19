public class Solution {
        public int solution(int n) {
            int answer = 0;

            if (n % 2 == 0) {
                for(;n>0;n-=2)
                    answer += (n * n);
            } else {
                for(;n>0;n-=2)
                    answer+=n;
            }
            return answer;
        }
    }


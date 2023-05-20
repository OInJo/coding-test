public class Solution {
        public int solution(int n) {
            int answer = 0;

            if (n % 2 == 0) {       //짝수
                for(;n>0;n-=2)              //n이 짝수이므로 n에 값을 2씩 낮춰 계속 짝수가 유지되게 for문을 돌림
                    answer += (n * n);      //answer에 n에 제곱 값을 구함      
            } else {                //홀수
                for(;n>0;n-=2)              //n이 홀수이므로 n에 값을 2씩 낮춰 계속 홀수가 유지되게 for문을 돌림
                    answer+=n;              //answer에 홀수의 값을 계속 더함 
            }
            return answer;
        }
    }


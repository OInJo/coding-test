class Solution {
    public int solution(int n) {
        int answer = 1; // 자기 자신은 포함되어 있어서 1로 시작
        for(int i = 1; i<=n; i++) {
            int sum = i;    // 시작하는 값을 i로 주고
            for(int j = i+1; j<=n; j++) {
                sum += j;   // i의 다음 값을 하나씩 더해서
                if(sum == n) {  // n이 완성되면 카운트
                    answer++;
                    break;
                }
                else if(sum > n) {  // 값이 n보다 커지면 이미 의미가 없기 때문에 break
                    break;
                }

            }
        }
        return answer;
    }
}
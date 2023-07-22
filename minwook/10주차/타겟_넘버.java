class Solution {
    int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(0, 0, numbers, target); // 0부터 배열의 갯수만큼 탐색
        return answer;
    }
    
    void dfs(int n, int s, int[] numbers, int target) {
        if (n == numbers.length) {
            if (s == target)
                answer++;
            return;
        }
        
        dfs(n + 1, s + numbers[n], numbers, target); 
        dfs(n + 1, s - numbers[n], numbers, target); 
    }
}

// 깊이 우선 탐색으로 모든 덧셈과 뺄셈의 모든 경우의 수를 시행
// 배열의 갯수만큼 시행한 뒤 값이 3이 나온 경우만 값 증가
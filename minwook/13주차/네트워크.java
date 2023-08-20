public class Solution {
  public int solution(int n, int[][] computers) {
    int answer = 0; // 네트워크 수
    boolean[] check = new boolean[n];  // 방문 여부
      
    for (int i = 0; i < n; i++) { // 모든 컴퓨터 순회
      if (!check[i]) {
        dfs(computers, i, check);
        answer++;
      }
    }

    return answer;
  }

  boolean[] dfs(int[][] computers, int i, boolean[] check) {
    check[i] = true;

    for (int j = 0; j < computers.length; j++) {
      if (i != j && computers[i][j] == 1 && check[j] == false) { // 연결되어 있고, 방문하지 않았으면 방문처리
        check = dfs(computers, j, check);
      }
    }
    return check;
  }
}

// boolean default가 false이므로, 첫 루프문에서 dfs 처리를 하면서 방문 처리 후 연결되어 있고, 방문하지 않은 곳 방문 처리하여 네트워크 갯수를 세는 방법g
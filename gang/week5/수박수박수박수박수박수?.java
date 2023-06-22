class Solution {
    public String solution(int n) {
        StringBuilder arr = new StringBuilder();    // 문자열을 넣게 되면 변화하므로 StringBuilder 사용
        for(int i=0; i<n; i++) {
            if(i%2 == 0) {  // n이 짝수일 때 수 넣고
                arr.append("수");
            }
            else {          // 홀수일때 박 넣음
                arr.append("박");
            }
        }
        String answer = arr.toString();
        return answer;
    }
}
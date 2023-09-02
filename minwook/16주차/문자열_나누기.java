class Solution {
    public int solution(String s) {
        int answer = 0;
        char firstS = s.charAt(0);
        int f = 0;
        int n = 0;
        for(int i=0; i<s.length(); i++){
            if(f==n){
                answer++;
                firstS = s.charAt(i);
            }
            if(firstS==s.charAt(i))
                f++;
            else
                n++;
        }
        return answer;
    }
}
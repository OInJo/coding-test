class Solution {
    public String solution(String s) {
        String[] sArr = s.split("");
        String answer = "";
        if(sArr.length % 2 == 0){
            answer += sArr[(sArr.length/2 - 1)];
            answer += sArr[(sArr.length/2)];
        }
        else
            answer += sArr[(sArr.length/2)];
        return answer;
    }
}
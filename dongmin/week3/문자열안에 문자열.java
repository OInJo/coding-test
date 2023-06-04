class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        answer=str1.contains(str2)?1:2;     //contains(): 문자열안에 특정 문자열이 포함되어 있는지 확인 후 true, false 반환

        return answer;
    }
}
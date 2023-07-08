class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i <= t.length() - p.length(); i++) { // t의 길이에서 p의 길이만큼 뺀 길이만큼 반복
            String comp = t.substring(i, i + p.length());   // p의 길이의 맞게 문자열을 잘라서
            if(comp.compareTo(p) <= 0) {    // p와 비교, 크키가 작으면 음수, 같으면 0이 나옴
                answer++;
            }
        }
        return answer;
    }
}
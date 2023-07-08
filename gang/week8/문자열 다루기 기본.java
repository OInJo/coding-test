class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6) {    // 길이 확인
            return false;
        }

        String[] arr = s.split(""); // 문자열을 나눠서 배열에 담기
        for(int i=0; i<arr.length; i++) {
            if(!arr[i].matches("[0-9]")) {  // 숫자인지 매치
                return false;
            }
        }
        return answer;
    }
}
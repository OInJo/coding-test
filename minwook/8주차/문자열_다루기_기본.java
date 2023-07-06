class Solution {
    public boolean solution(String s) {
        if(s.length()==4 || s.length()==6)
            return s.matches("\\d+"); // \\d+ 숫자에 해당하는 문자를 1개 이상 포함하는지 검사하는 정규표현식
        else
            return false;
    }
}

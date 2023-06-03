class Solution {
    public int solution(String str1, String str2) {
        if(str1.contains(str2)) {   //contains함수를 사용하여 str1에 str2가 있는지 확인
            return 1;
        }
        else {
            return 2;
        }
    }
}
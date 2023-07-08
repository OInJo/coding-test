import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        int i = Arrays.asList(seoul).indexOf("Kim");        //asList로 배열을 List형으로 바꾸고 "KIM"이라는 값이 있으면 인덱스 리턴
        return "김서방은 " + i +"에 있다" ;
    }
}
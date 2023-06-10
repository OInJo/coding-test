import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String strNum=Integer.toString(n);  //매개 변수 n은 int형이므로 형변환을 통해 String형 strNum에 저장
        for(int i=0;i<strNum.length();i++)
            answer+=(strNum.charAt(i)-'0');     //문자열을 각 각 자릿수를 뽑아내서 answer에 더함
                                                //뒤에 -'0'을 하는 이유는 그냥 계산할 시 아스키 코드 값으로 계산이 된다.
                                                //그렇기 때문에 '0'(48) 값을 빼 주어서 int형 숫자로 나오는 역할을 해준다.

        return answer;
    }
}
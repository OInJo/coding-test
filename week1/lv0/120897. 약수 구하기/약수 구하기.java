import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int num) {
        List<Integer> divisors = new ArrayList<>();     //Integer 타입의 요소를 가지는 divisors라는 이름의 ArrayList를 생성

        for (int i = 1; i <= num; i++) {        
            if (num % i == 0) {
                divisors.add(i);                        //add()메서드: num이 나누어 떨어지는 값 i를 divisors list에 추가함
            }
        }
        
        int [] answer=new int [divisors.size()];        //divisors에 사이즈(위에 반복문에서 add()메서드에 포함된 값)를 배열 answer에 크기로 지정
        for (int i = 0; i < divisors.size(); i++) {     
            answer[i]=divisors.get(i);                  // divisors 리스트에 i번째값을 배열 answer에 i번째에 추가함. (순차적으로 추가됨)
        }

        return answer;
    }
}
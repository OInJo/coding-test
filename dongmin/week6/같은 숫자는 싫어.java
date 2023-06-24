import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {      //두 개 뽑아서 더하기 소스와 마찬가지로 반환형을 바꿨다.
        List<Integer> answer = new ArrayList<>();   //값이 몇개가 나올지 모르므로 동적으로 배열 크기를 조절하기 위해 ArrayList 사용
        answer.add(arr[0]);     //첫번째 인덱스값을 넣어준다.
        for (int i = 1; i < arr.length; i++) {  //반복문이 1부터 시작하기 때문에 위에서 첫번째 인덱스 값을 넣어줌
            if(arr[i-1] != arr[i])    //i를 0부터 시작하면 인덱스 값이 오버 된다.
                answer.add(arr[i]);
        }
        return answer;
    }
}
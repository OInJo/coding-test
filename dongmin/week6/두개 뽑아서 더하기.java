import java.util.*;

class Solution {
    public List<Integer> solution(int[] numbers) {      //반환형을 List형으로 바꾸면 List형으로 선언된 answer 배열로 변환하는 과정을 줄일 수 있다.
                                                        //다른 사람의 풀이를 보고 변환 과정 코드를 변경했더니 코드가 간결해졌다.

        Arrays.sort(numbers);
        List<Integer> result = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                result.add(numbers[i]+numbers[j]);      //resut에 나올 수 있는 모든 값들을 담는다.
            }
        }
        Collections.sort(result);       //정렬을 통해 값들을 오름차순으로 정렬하고
        for (int num : result) {        
            if(!answer.contains(num))       //answer에 같은 값이 없을 때 
                answer.add(num);            //answer에 값을 넣는다.
        }

        return answer;
    }
}
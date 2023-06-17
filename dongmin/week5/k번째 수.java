import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            for(int j=(commands[i][0]-1);j<commands[i][1];j++){     //첫번째 인덱스에 접근하기 위해 -1을 빼준다.
                arr.add(array[j]);      //값을 arr에 넣어준다.
            }
            Collections.sort(arr);      //arr에 들어간 값을 sort 메서드를 통해 오름차순 정렬한다.
            answer[i]=arr.get((commands[i][2])-1);      //n번째 인덱스에 들어가 그 값을 answer에 i번째에 넣어준다.
            arr.clear();                //arr을 다시 초기화하고 commands에 다음 원소에 접근한다.
        }

        return answer;
    }
}
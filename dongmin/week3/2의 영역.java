import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> index = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 2){        //배열의 값이 2인 i(인덱스)의 값을 List형 index에 넣어줌.
                index.add(i);
            }
        }
        if(index.size() == 0){
            return new int[]{-1};       //들어온 값이 없으면 -1 반환
        }
        int start = index.get(0);       //값이 2였던 첫번째 인덱스 번호
        int end = index.get(index.size()-1);        //값이 2였던 마지막 인덱스 번호(인덱스는 0번 부터 시작하므로 배열의 사이즈에서 1을 뺌)
        answer = Arrays.copyOfRange(arr,start,end+1);           //arr 배열의 start번째 부터 end번째까지의 인덱스를 answer에 넣어줌.
        return answer;
    }
}
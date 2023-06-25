import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < photo.length; j++) {
                List<String> strList = new ArrayList<>(Arrays.asList(photo[j]));    //photo에 크기가 전부 다르기에 ArrayList를 사용해 동적으로 크기 조절
                                                                                    //asList 메서드는 ArrayList에 현재 배열에 값을 넣어준다. 
                if (strList.contains(name[i])) {        //같은 값이 있을 경우
                    answer[j] += yearning[i];           //answer에 j번째 인덱스에 값을 yearning만큼 더함
                }
                strList.clear();                        //ArrayList를 초기화함
            }
        }

        return answer;
    }
}
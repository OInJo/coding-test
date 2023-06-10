import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> result=new ArrayList<>();     //정수형 데이터를 저장하는 리스트를 만든다.
        switch(n){  //n은 1,2,3,4값이 들어오므로 switch - case문 작성
            case 1:
                for(int i=0;i<=(slicer[1]);i++)
                    result.add(num_list[i]);        //ArrayList는 초반 사이즈를 지정해주지 않아도 된다는 장점이 있음.
                break;
            case 2:
                for(int i=slicer[0];i< num_list.length;i++)
                    result.add(num_list[i]);
                break;
            case 3:
                for(int i=slicer[0];i<=(slicer[1]);i++)
                    result.add(num_list[i]);
                break;
            case 4:
                for(int i=slicer[0];i<=(slicer[1]);i+=slicer[2])
                    result.add(num_list[i]);
                break;
        }
        int[] answer= new int[result.size()];   //answer 배열에 크기를 result에 사이즈와 같게 설정해줌
        for (int i = 0; i < answer.length; i++)
            answer[i]=result.get(i);        //result에 값들을 answer에 넘김

        return answer;
    }
}
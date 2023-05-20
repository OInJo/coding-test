import static java.lang.Integer.parseInt;

class Solution {
    public String[] solution(String[] quiz) {       //quiz ex) X + Y = Z
        
        String [] answer = new String[quiz.length]; //quiz에 크기 만큼 추가 (수식이 두개인 경우 크기는 2가 됨)
        int result;
        for (int i = 0; i < quiz.length; i++) {
            String [] arr = quiz[i].split(" ");     //split(" "): 문자열을 공백을 기준으로 나누어 배열 arr에 저장
            if(arr[1].equals("+")) {                
                if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]))    //X와 Y를 더한 값이 Z와 같으면 "O"출력
                    answer[i] = "O";
                else
                    answer[i]="X";                  //다르면 "X" 출력
            } else if(arr[1].equals("-")){          
                if (Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]))
                    answer[i] = "O";
                else
                    answer[i]="X";
            }
        }
        return answer;
    }
}
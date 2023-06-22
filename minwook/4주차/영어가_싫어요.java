import java.util.Arrays;
class Solution {
    public long solution(String numbers) {
        String answerStr = "";
        String[] arr = numbers.split("");

        // one
        // four, five, nine, zero
        // eight
        // six, seven
        // two, three

        for(int i=0; i<arr.length-2; i++){
            if(arr[i].equals("o")){
                answerStr = answerStr + "1";
                i+=2;
            } else if(arr[i].equals("f") || arr[i].equals("n") || arr[i].equals("z")){
                answerStr = arr[i].equals("n") ? answerStr + "9" : arr[i+1].equals("o") ? answerStr + "4" : arr[i].equals("z") ? answerStr + "0" : answerStr + "5";
                i+=3;
            } else if(arr[i].equals("e")){
                answerStr = answerStr + "8";
                i+=4;
            } else if(arr[i].equals("s")){
                if(arr[i+1].equals("i")){
                    answerStr = answerStr + "6";
                    i+=2;
                } else {
                    answerStr = answerStr + "7";
                    i+=4;
                }
            }
            else {
                if(arr[i+1].equals("w")){
                    answerStr = answerStr + "2";
                    i+=2;
                } else {
                    answerStr = answerStr + "3";
                    i+=4;
                }
            }
        }
        return Long.parseLong(answerStr);
    }
} // 앞의 알파벳이 같은것을 먼저 묶고, 문자의 수로 묶은 뒤 조건에 따라 문자열 숫자를 더한 뒤 숫자로 변환
// replaceAll, replace, Map 함수를 사용한 풀이도 가능할듯
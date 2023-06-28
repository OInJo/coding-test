class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sList = s.split(""); // 문자열 -> 배열 변환
        int n = 0;
        for(int i=0; i<sList.length; i++){
            if(!sList[i].equals(" ")){ // 공백인지 확인
                if(n%2==0){ // 홀수면 대문자
                    answer += sList[i].toUpperCase();
                    n++; 
                }
                else{ // 짝수면 소문자
                    answer +=sList[i].toLowerCase();
                    n++;
                }
            }
            else{ // 공백이면 초기화 및 공백 더하기
                answer += sList[i];
                n=0;
            }
        }
        return answer;
    }
}
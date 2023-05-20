class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++){
            String[] quizArr = quiz[i].split(" "); // 공백 기준으로 나누기
            if(quizArr[1].equals("+")){ // + 문자열 비교 (equals() 메서드 사용)
                answer[i] = Integer.parseInt(quizArr[0]) + Integer.parseInt(quizArr[2]) == Integer.parseInt(quizArr[4]) ? "O" : "X";
            }  // 참이면 O, 거짓이면 X
            else if(quizArr[1].equals("-")){
                answer[i] = Integer.parseInt(quizArr[0]) - Integer.parseInt(quizArr[2]) == Integer.parseInt(quizArr[4]) ? "O" : "X";
            }
        }
        return answer;
    }
}
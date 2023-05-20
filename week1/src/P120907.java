class P120907 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i=0; i<quiz.length; i++) {
            String[] param = quiz[i].split(" ");
            int x = Integer.parseInt(param[0]);
            int y = Integer.parseInt(param[2]);
            int z = Integer.parseInt(param[4]);

            int result = 0;
            if(param[1].equals("+")) {
                result = x + y;
            }
            else {
                result = x - y;
            }

            answer[i] = (z == result) ? "O" : "X";

        }
        return answer;
    }
}
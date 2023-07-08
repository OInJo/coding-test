class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i< food.length; i++) {   // food 배열의 두 번째부터 음식이므로 1부터 시작
            if(food[i] >= 2) {  // 두 선수가 먹어야 하기 때문에 2 이상일 때
                int cnt = food[i] / 2;  // 몇개씩 나눌 수 있는지 확인 후
                for(int j = 0; j < cnt; j++) {  // answer에 더함
                    answer += i;
                }
            }
        }

        StringBuffer sb = new StringBuffer(answer); // reverse 메소드를 사용하기 위해 StringBuffer 사용
        String reverse = sb.reverse().toString();   // reverse 메소드로 한 선수가 먹는 순서의 역순을 저장

        answer = answer + 0 + reverse;  // 원래 순서와 물인 0, 역순의 순서를 저장
        return answer;
    }
}
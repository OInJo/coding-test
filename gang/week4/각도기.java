class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle <= 90) {   //각도가 90보다 작거나 같을 때
            if(angle == 90) {   //90이면 2
                answer = 2;
            }
            else {      //90보다 작으면 1
                answer = 1;
            }
        }
        else {      //각도가 90보다 클 때
            if(angle == 180) {  //180이면 4
                answer = 4;
            }
            else {      //아니면 3
                answer = 3;
            }
        }
        return answer;
    }
}
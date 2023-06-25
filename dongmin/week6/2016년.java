class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};   //1월 1일이 금요일이므로 금요일을 첫번째 인덱스 값으로 설정
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  //총 날짜를 구하기 위해서 값을 설정
        int days = 0;       //지나간 총 날짜를 구하는 변수

        for (int i = 0; i < a; i++) {
            days += month[i];       //지나간 달을 구해서 1월이면 0이 들어가게 설정 한다.
        }
        days += b-1;    //1월 1일일 경우 days가 0번째 인덱스부터 시작할 수 있도록 1을 빼준다.
        if(days<=7)
            return day[days];   //days가 7이하일 경우에는 그 days의 인덱스를 바로 넣도록 설정
        answer = day[(days) % 7];   //days의 7을 나눠 거기에 해당하는 요일을 구하도록 설정


        return answer;
    }

}
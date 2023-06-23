class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};   // 금요일 시작이므로 금요일부터 요일 배열 생성
        int[] totalDay = {31,29,31,30,31,30,31,31,30,31,30,31}; // 각 월 별 최대 일잘 배열 생성
        int days = 0;

        for(int i = 0; i< a - 1; i++) {     // 찾으려는 달의 전 달까지 총 일수를 더해서
            days += totalDay[i];
        }

        days += b - 1;  // 찾으려는 요일의 일을 더함 1일부터 시작이므로 -1

        int index = days % 7;   // 1월 1일부터 찾으려는 요일의 날짜까지의 총 일수에서 7을 나눔

        return day[index];  // 요일 찾아서 리턴
    }
}
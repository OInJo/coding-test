class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int month = 1;
        int day = 0;
        int finDay = 31;

        for (int i = 1; i < a; i++) {
            if (i == 2)
                finDay = 29; 
            else if (i == 4 || i == 6 || i == 9 || i == 11)
                finDay = 30;
            else
                finDay = 31;
            day += finDay;
        }

        day += b;
        answer = days[day % 7];

        return answer;
    }
}

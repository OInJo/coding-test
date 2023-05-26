class P120884 {
    public int solution(int chicken) {
        int answer = Chicken(chicken);
        return answer;
    }

    public static int Chicken(int num) {
        int service = num / 10;
        int remain = num % 10;
        int total = service + remain;

        if(num < 10) {
            return 0;
        }

        return service + Chicken(total);
    }
}
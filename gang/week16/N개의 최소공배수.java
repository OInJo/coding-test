class Solution {
    public int solution(int[] arr) {
        if(arr.length == 1) {
            return arr[0];
        }

        int gcd = getGCD(arr[0], arr[1]);   // 첫번째, 두번째 수의 최대공약수
        int lcm = (arr[0] * arr[1]) / gcd;  // 최소 공배수

        for (int i = 2; i < arr.length; i++) {  // 세번째 항부터
            gcd = getGCD(lcm, arr[i]);  // 최대 공약수
            lcm = (lcm * arr[i]) / gcd; // 최소 공배수
        }

        return lcm;

    }

    public static int getGCD(int num1, int num2) {  // 최대 공약수 구하는 함수
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }
}
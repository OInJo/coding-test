import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String evenOrOdd = (n % 2 == 0) ? n + " is even" : n + " is odd"; // 삼항 연산자 사용
        System.out.print(evenOrOdd); 
    }
}
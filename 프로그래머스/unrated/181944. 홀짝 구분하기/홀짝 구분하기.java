import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //입력값
        int n = sc.nextInt();                       //사용자로부터 입력된 정수 값을 읽어옴
        
        if(n%2==0)
            System.out.println(n +" is even");      
        else
            System.out.println(n +" is odd");
    }
}
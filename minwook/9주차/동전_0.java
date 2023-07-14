import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader 입력 스트림에서 문자열을 읽음 readLine() 메서드 사용하여 문자열 읽음 
        // System.in 자바의 표준 입력 스트림(바이트 스트림) -> InputStreamReader를 통해 문자(문자 스트림)로 변환

        StringTokenizer st = new StringTokenizer(br.readLine());
        //StringTokenizer 문자열을 지정된 구분자를 기준으로 토큰으로 분리 (기본값 - 공백)
        //hasMoreTokens() 다음 읽을 토큰 여부, nextToken() 다음 토큰 반환, countToken() 남아 있는 토큰 개수 반환
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        Integer coin[] = new Integer[n];
        
        for(int i=0; i<n; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        
        int answer = 0;
        
        for(int i=n-1; i>=0; i--){
            while(k >= coin[i]){
                k -= coin[i];
                answer++;
            }
            if(k==0)
                break;
        }
        
        System.out.println(answer);
    }
}
import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int arrLength = arr.length;
        Arrays.sort(arr);
        int answer = arr[arrLength-1];
        while(true){
            int mul = 0;
            for(int i=0; i<arr.length; i++){
                if(answer % arr[i] == 0)
                    mul++;
            }
            if(mul == arrLength)
                break;
            answer++;
        }
        return answer;
    }
}
// 첫번째 풀이 정렬 후 값을 증가시키며 최소공배수르 찾으면 return

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        int mult = 0;
        for(int i=1; i<arr.length; i++){
            mult = answer * arr[i] / gcd(answer, arr[i]);
            answer = mult;
        }
        return answer;
    }
    
    public int gcd(int a, int b){
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        while(max % min != 0){
            int temp = max % min;
            max = min;
            min = temp;
        }
        return min;
    }
}

// 두번째 풀이 최소 공약수를 구해서 최소 공배수 구하기
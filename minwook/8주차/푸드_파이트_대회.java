class Solution {
    public String solution(int[] food) {
        String answer = "";
        int f = 0;
        for(int i=1; i<food.length; i++){
            f = food[i]/2;
            if(f >= 1){
                while(f>0){
                    answer += i;
                    f--;
                }
            }
        }
        answer += '0';
        for(int i=food.length-1; i>0; i--){
            f = food[i]/2;
            if(f >= 1){
                while(f>0){
                    answer += i;
                    f--;
                }
            }
        }
        return answer;
    }
    
} 
// 양쪽에 같은 숫자를 배치하고 가운데 0을 삽입해야함
// 앞뒤로 숫자 추가 or StringBuilder 사용하면 더 좋은 코드가 가능할듯
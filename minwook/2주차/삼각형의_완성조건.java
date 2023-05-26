class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longSide = Math.max(sides[0], sides[1]); // 큰 값 구하기
        int leastSide = longSide - Math.min(sides[0], sides[1]); // 큰 값 - 작은 값 (경우의 수 첫번째)
        int sum = sides[0] + sides[1];
        for(int i=leastSide; i<longSide; i++) // 남은 변이 가장 큰변이 아닐 경우(1)
        {
            answer++;
        }
        while(longSide < sum){ // 남은 변이 가장 큰변일 경우(2)
            longSide++;
            if(longSide != sum){
                answer++;
            }
        }
        return answer;
    }
} 

class Solution2 {
    public int solution(int[] sides) {
        int min = Math.min(sides[0], sides[1]);
        return min * 2 - 1;
    }
}
// 문제에서 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 함
// sides[a,b]라고 가정 남은 변은 c
// c < a+b (c가 가장 큰 변인 경우)) 
// b(a) < a(b)+c (a 또는 b가 가장 큰 변인 경우)
// a-b(b-a) < c < a+b => c의 개수 2b-1(a가 큰 변) 혹은 2a-1(b가 큰 변)
// ex) [11,7] 13개

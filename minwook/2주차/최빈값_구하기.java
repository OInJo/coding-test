class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int arrLength = 0;
        int comparison = 0;
        
        for(int n : array){ // 배열의 모든 값에 접근
            if (n > arrLength) // 현재 배열의 값이 이전 배열의 값보다 크면 실행
            arrLength = n; // 배열 가장 높은 값
        }
        
        int[] answerArr = new int[arrLength+1]; // 배열의 크기 지정 
        int duplication = 0;
        
        for(int n : array){
            answerArr[n]++; // array 값이 중복되면 값 + 1
        }
        for(int i=0; i<arrLength+1; i++){
            if(answerArr[i] > comparison){ // 중복된 개수와 비교값 비교
                answer = i; // 중복된 개수가 더 많은 값이 answer에 대입
                comparison = answerArr[i]; // 중복 개수를 비교값에 대입
            }
        }
        for(int n : answerArr){
            if(n == comparison) // 중복 개수가 비교값과 같으면
                duplication++; // 중복값 +1
            if(duplication > 1) // 같은 최빈값이 2개 이상이면
                return -1; // -1 
        }
        
        return answer;
    }
}
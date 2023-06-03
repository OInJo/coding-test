class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);   // int형 변수 order를 String형으로 변환
        char[] result = str.toCharArray();      // String 문자열을 문자 배열로 변환

        for (int i = 0; i < result.length; i++) {   // 배열 크기만큼 반복문 실행
            char num = result[i];  // 배열의 각 값을 char형 변수 num에 넣어서
            if (num == '3' || num == '6' || num == '9') {   // num의 값이 3,6,9인지 확인
                answer++;
            }
        }

        return answer;
    }
}
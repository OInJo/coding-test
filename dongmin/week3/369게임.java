class Solution {
    public int solution(int order) {
        int answer = 0;
        String result = Integer.toString(order);        //int형 order를 String 형으로 변환

        for (int i = 0; i < result.length(); i++) {     //자릿수 마다 연산을 함.
            if((result.charAt(i)-'0')%3==0&&result.charAt(i)!='0') {      //charAt()은 문자열이 때문에 -'0'을 붙이지 않으면 3에 아스키 코드 값인 51이 되어버려서
                                                                          //51%3==0으로 연산이 진행됨.
                System.out.println(result.charAt(i));
                answer++;
            }
        }
        return answer;
    }
}
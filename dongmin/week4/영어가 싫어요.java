class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] strNumber = {"zero",
                "one", "two", "three",
                "four", "five", "six",
                "seven", "eight", "nine"
        };      //각각에 문자열 숫자들을 찾을 배열 strNumber를 선언
        for (int i = 0; i < strNumber.length; i++) {
            if (numbers.contains(strNumber[i]))     //문자열에서 strNumber 배열에 해당하는 문자열을 찾으면 true
                numbers=numbers.replaceAll(strNumber[i],(i)+"");    //numbers문자열에 strNumber[i]에 해당하는 값을 
                                                                    //현재 i값으로 바꿈(i는 int형이기 때문에 공백 문자를 더해 문자열로 만들어줌)
        }


        answer = Long.parseLong(numbers);       //numbers를 long형으로 바꿔서 answer에 넣어줌
        return answer;
    }
}
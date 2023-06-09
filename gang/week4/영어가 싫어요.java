import java.util.HashMap;

class Solution {
    public long solution(String numbers) {
        // HashMap을 사용하여 영어와 숫자를 Key, Value로 매칭 시켰다.
        HashMap<String, Integer> stringToNum = new HashMap<>();
        stringToNum.put("zero", 0);
        stringToNum.put("one", 1);
        stringToNum.put("two", 2);
        stringToNum.put("three", 3);
        stringToNum.put("four", 4);
        stringToNum.put("five", 5);
        stringToNum.put("six", 6);
        stringToNum.put("seven", 7);
        stringToNum.put("eight", 8);
        stringToNum.put("nine", 9);

        StringBuilder compare = new StringBuilder();        // StringBuilder를 사용하면 문자열의 변화를 바로 저장이 가능하다.
        StringBuilder answer = new StringBuilder();
        char[] ch = numbers.toCharArray();              // String 배열의 값을 하나하나 불러오기 위해 char형 배열로 바꿔주었다.

        for (int i = 0; i < numbers.length(); i++) {    //문자열의 길이만큼 반복
            compare.append(ch[i]);                      // StringBuilder는 값을 append로 넣는다. 문자열의 값을 하나씩 넣어주는 코드
            String current = compare.toString();        // StringBuilder의 값을 다시 String으로 바꿔준다. 비교하기 위함

            if (stringToNum.containsKey(current)) {     // String으로 바꾼 문자열이 HashMap에 있는 Key와 매칭되면
                int digit = stringToNum.get(current);   // value값을 digit변수에 넣고
                answer.append(digit);                   // 그 값을 answer StringBuilder에 넣는다.
                compare.setLength(0);                   // 숫자로 바꾸었으면 다음 영어를 숫자로 바꾸기 위해 초기화를 시켜준다.
            }
        }

        return Long.parseLong(answer.toString());       // StringBuilder를 출력하기 위해서는 String으로 바꿔주어야 한다.
        // 조건에 정수로 바꿔야 하기 때문에 정수형으로 바꿔주는데 Int형으로 바꾸면 길이의 제한이 생길 수 있어 Long으로 바꿔준다.
    }
}
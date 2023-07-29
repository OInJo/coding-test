import java.util.HashSet;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder result = new StringBuilder(); // 문자열을 넣기 위한 StringBuilder
        HashSet<Character> skipSet = new HashSet<>();   // 중복 제거를 위해 HashSet

        for(char c : skip.toCharArray()) {  // skip문자열을 skipSet에 담기
            skipSet.add(c);
        }

        for(char c : s.toCharArray()) { // 문자열 s를 하나씩 나눠서
            for(int i = 1; i <= index; i++) {   // index만큼 반복
                c++;    // 문자열 c 한개씩 증가
                if(c > 'z') {   // 문자열이 z를 넘어가면 a로 넘겨줌
                    c -= 26;
                }
                if (skipSet.contains(c)) {  // 문자열이 skip에 포함될 경우 i를 감소시켜서 한번 더 문자열 c증가
                    i--;
                }
            }
            result.append(c);   // 변환한 문자열 c를 담음
        }

        return result.toString();
    }
}

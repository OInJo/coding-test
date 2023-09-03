import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i=0; i<s.length(); i++) {
            String rotated = s.substring(i+1) + s.substring(0,i+1); // 회전에 맞춰서 문자열 수정
            if(proper(rotated)) {
                answer++;
            }
        }
        return answer;
    }

    public boolean proper(String s) {   // 스택을 사용하여 괄호가 맞는지 아닌지 확인
        Stack<Character> stack = new Stack<>();

        for(char b : s.toCharArray()) {
            if(b == '(' || b == '{' || b == '[') {
                stack.push(b);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((b == ')' && top != '(') ||
                        (b == ']' && top != '[') ||
                        (b == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
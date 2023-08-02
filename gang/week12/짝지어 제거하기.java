import java.util.Stack;

class Solution {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>(); // 스택 사용

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {    // 스택이 비워져 있지 않고, 맨 위 문자가 현재 문자와 같으면
                stack.pop();    // 맨위 문자 제거
            } else {
                stack.push(c);  // 아니면 현재 문자 삽입
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}

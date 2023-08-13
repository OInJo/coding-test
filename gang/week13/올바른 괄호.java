import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> bracket = new Stack<>();

        for(char b : s.toCharArray()) {
            if(b == '(') {  // 괄호가 ( 이면 push
                bracket.push(b);
            }
            else {
                if(bracket.isEmpty()) { // 만약 괄호가 ) 인데 스택이 비워져 있으면 괄호가 사라지지 않으므로 false반환
                    return false;
                }
                else {
                    bracket.pop();  // 비워져 있지 않으면 스택애는 ( 괄호가 있기 때문에 사라지므로 pop 사용
                }
            }
        }

        if(bracket.isEmpty()) { // 스택에 전부 비워져 있으면 true, 아니면 false 반환
            return true;
        }
        else {
            return false;
        }
    }
}
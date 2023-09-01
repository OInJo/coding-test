import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            // 스택이 비워있지 않고, 현재 값이 스택 마지막 값보다 크면 뒷큰수가 됨
            while (!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
                int idx = stack.pop();  // 스택 마지막 값의 위치를 찾아서
                answer[idx] = numbers[i];   // 뒷큰수로 값을 바꿔줌
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {  // 남은 값들은 뒷큰수가 없는 애들이기 때문에 -1로 바꿔줌
            int idx = stack.pop();
            answer[idx] = -1;
        }

        return answer;
    }
}

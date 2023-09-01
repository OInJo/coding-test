import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;

        Stack<Integer> belt = new Stack<>();    // 기존 컨테이너 벨트
        Stack<Integer> spare = new Stack<>();   // 보조 벨트

        for(int i=order.length; i >= 1; i--) {  // 기존 컨테이너 벨트에 1부터5까지 역순으로 넣음
            belt.push(i);
        }

        while(order[0] != belt.peek()) {    // 트럭에 담아야 할 첫번째 박스 이전 박스들을 보조 벨트에 넣고
            spare.push(belt.pop());
        }

        answer++;   // 트럭에 박스 담음
        belt.pop(); // 박스 제거

        for (int i = 1; i < order.length; i++) {
            if(!belt.isEmpty() && order[i] == belt.peek()) {    // 기존 벨트 맨 첫번째 박스가 트럭에 담아야 할 박스면
                answer++;   // 박스 담고
                belt.pop(); // 박스 제거
            }
            else if(!spare.isEmpty() && order[i] == spare.peek()) { // 보조 벨트 맨 첫번째 박스가 트럭에 담아야 할 박스면
                answer++;   // 박스 담고
                spare.pop();    // 박스 제거
            }
            else {
                if(!belt.isEmpty() && order[i] > belt.peek()) { // 기존 벨트에 있는 박스를 보조 벨트로 옮겨야 하는 경우
                    while(order[i] != belt.peek()) {    // 처음과 동일하게 옮겨주고
                        spare.push(belt.pop());
                    }
                    answer++;   // 박스 담고
                    belt.pop(); // 박스 제거
                }
                else {
                    break;
                }
            }
        }

        return answer;
    }
}
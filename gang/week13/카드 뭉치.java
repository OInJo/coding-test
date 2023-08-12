import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Map<String, Integer> indexMap1 = new HashMap<>();
        Map<String, Integer> indexMap2 = new HashMap<>();

        for (int i = 0; i < cards1.length; i++) {
            indexMap1.put(cards1[i], i);    // card1의 단어와 index를 담음
        }

        for (int i = 0; i < cards2.length; i++) {
            indexMap2.put(cards2[i], i);    // card2의 단어와 index를 담음
        }

        int prev1 = 0;
        int prev2 = 0;

        for (int j = 0; j < goal.length; j++) {
            String word = goal[j];
            if (indexMap1.containsKey(word)) {  // indexMap1 있는 단어가 goal에 있는 경우
                // 순서가 중요하기 때문에 goal의 현재 단어의 인덱스가 이전 단어의 인덱스보다 작으면 이전 인덱스 증가시키고 계속 진행
                if (prev1 + 1 > indexMap1.get(word)) {
                    prev1++;
                    continue;
                }
            }

            if (indexMap2.containsKey(word)) {  // indexMap1과 같은 방법으로 진행
                if (prev2 + 1 > indexMap2.get(word)) {
                    prev2++;
                    continue;
                }
            }
            return "No";
        }
        return "Yes";
    }
}
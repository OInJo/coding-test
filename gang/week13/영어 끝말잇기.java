import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> usedWords = new HashSet<>();    // 사용한 단어를 담을 HashSeet
        char lastChar = words[0].charAt(words[0].length() - 1); // 이전 단어의 마지막 문자열
        usedWords.add(words[0]);    // 첫번째 단어를 담고

        for(int i=1; i < words.length; i++) {   // 두번째 단어부터 비교 시작
            String word = words[i];
            // 단어가 사용한 단어에 있거나 이전 단어의 마지막이 현재 단어의 시작과 다르면
            if(usedWords.contains(word) || word.charAt(0) != lastChar) {
                int person = (i % n) + 1;   // 몇번째 사람이
                int num = (i / n) + 1;      // 몇번째에 틀렸는지 계산
                return new int[]{person, num};
            }
            else {
                usedWords.add(word);    // 끝말잇기 조건에 맞으면 사용한 단어에 넣고
                lastChar = word.charAt(word.length()-1);    // 현재 단어의 마지막 문자열을 lastChar에 담음
            }
        }

        return new int[]{0,0};  // 탈락자가 없으면 0,0 리턴
    }
}
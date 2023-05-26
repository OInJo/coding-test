import java.util.HashSet;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int frequency[] = new int[1000];
        HashSet<Integer> frequencySet = new HashSet<>();

        for (int i = 0; i < array.length; i++) {    // 배열의 길이만큼 반복
            frequency[array[i]]++;  // array 배열의 값을 frequency 배열의 위치로 지정하면 값을 증가시켜 빈도수를 구함
            frequencySet.add(array[i]); // 중복을 체크하기 위해 HashSet으로 선언한 frequencySet에 값 넣음

            if (max < frequency[array[i]]) {    // frequency 배열에서 빈도수를 확인하여 빈도수 제일 큰 값을 찾음
                max = frequency[array[i]];
                answer = array[i];
            }
        }

        int temp = 0;
        for (int j : frequencySet) {    // frequencySet 만큼 반복문을 돌려서 최대 빈도수가 같은 배열값이 있는지 확인
            if (max == frequency[j]) {
                temp++;
            }
            if (temp > 1) { // 최빈값을 제외한 최대 빈도수가 같은 다른 값이 있으면 temp가 1보다 커지므로 최빈값이 2개므로 -1 리턴
                answer = -1;
                break;
            }
        }

        return answer;
    }
}
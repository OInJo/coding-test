import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public List<Integer> solution(int n) {
        HashSet<Integer> prime = new HashSet<>();
        for (int i = 2; i <= n; i++) {  //소수를 구해기 위해 2부터 시작
            while (n % i == 0) {
                prime.add(i);   // 주어진 값을 나누었을 때 0인 값을 prime에 넣음
                n /= i;
            }
        }

        List<Integer> sortPrime = new ArrayList<>(prime);   //HashSet은 오름차순 정렬이 불가능하므로 ArrayList로 변경
        Collections.sort(sortPrime);    //오름차순으로 정렬

        return sortPrime;
    }
}

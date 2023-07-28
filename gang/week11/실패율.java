import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> failureRate = new HashMap<>();     // 스테이지와 실패율을 연결짓기 위해 Map 사용

        for(int i=1; i <= N; i++) { // 각 스테이지의 도전자와 실패자를 구하는 반복문
            int mol = 0;
            int denom = 0;
            for(int j=0; j < stages.length; j++) {
                if(stages[j] >= i) {
                    denom++;
                }
                if(stages[j] == i) {
                    mol++;
                }
            }

            double fail = 0.0;  // 실패율 구함
            if (denom != 0) {
                fail = (double) mol / denom;
            }

            failureRate.put(i, fail);   // 실패율을 스테이지와 같이 Map 배열에 담음
        }
        double[] arr = new double[N];   // 스테이지의 실패율을 담는 배열
        int index = 0;
        for (double value : failureRate.values()) {
            arr[index] = value;
            index++;
        }

        int[] result = new int[N];  // 각 스테이지를 담는 배열
        int num = 0;
        for(int key : failureRate.keySet()) {
            result[num] = key;
            num++;
        }

        for(int i=0; i < N - 1; i++) {      // 스테이지의 실패율을 비교해서 스테이지의 위치를 옮김
            for(int j = i; j < N; j++) {
                if(arr[i] < arr[j]) {
                    double temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                    int key = result[j];
                    result[j] = result[i];
                    result[i] = key;
                }
                if(arr[i] == arr[j]) {  // 실패율이 같은 경우 스테이지 단계가 낮은것이 앞으로
                    if(result[i] > result[j]) {
                        int a = result[i];
                        result[i] = result[j];
                        result[j] = a;
                    }
                }
            }
        }
        return result;
    }
}
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] failable = new double[N][2];
        int stageLength = stages.length;
        
        for (int i = 0; i < N; i++) {
            int fail = 0;
            for (int n : stages) {
                if (n == i + 1) { 
                    fail += 1;
                }
            }
            if(stageLength != 0){
                failable[i][1] = (double) fail / (double) stageLength;
            }
            else
                failable[i][0] = 0.0;
            failable[i][0] = i+1;
            stageLength -= fail;
        }
        
        Arrays.sort(failable, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o2[1], o1[1]);
            }
        });
        
        for (int i = 0; i < N; i++) {
            answer[i] = (int) failable[i][0];
        }
    
        return answer;
    }
}

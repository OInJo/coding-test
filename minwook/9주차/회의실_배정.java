import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 회의실 개수 지정

        int[][] time = new int[n][2]; 

        for(int i=0; i<n; i++) {
            time[i][0] = in.nextInt();
            time[i][1] = in.nextInt();
        }

        Arrays.sort(time, new Comparator<int[]>() { // 수정: Comparator 타입 파라미터는 int[]로

            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0]-o2[0];
                }

                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int pre_end_time = 0;

        for(int i=0; i<n; i++) {
            if(pre_end_time <= time[i][0]) {
                pre_end_time = time[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}

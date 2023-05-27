import java.util.HashSet;

class Solution {
    public int solution(int[][] lines) {
        HashSet<Integer> points = new HashSet<>();  //HashSet은 중복된 값이 들어가지 않아서 사용
        HashSet<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < lines.length; i++) {    //배열의 길이만큼 반복
            for (int j = lines[i][0]; j < lines[i][1]; j++) {   //한 선에서 시작지점부터 끝지점 전까지 반복
                // 끝 지점 전까지 한 이유는 중복된 점을 구해서 길이를 구하는데 점만 겹치고 길이는 추가되지 않는 경우가 있기 때문
                if (!points.add(j)) {   //HashSet은 중복된 값이 있는 경우 false를 반환하기 때문에 중복된 점이 있으면
                    duplicates.add(j);  //다른 HashSet인 duplicates에 값을 넣어줌
                }
            }
        }
        return duplicates.size();   //중복된 점의 길이를 통해여 중복된 선의 길이를 구함
    }
}

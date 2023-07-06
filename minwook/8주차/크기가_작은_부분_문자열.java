class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] tArr = t.split("");
        int n = 1;

        for(int i=0; i<=tArr.length-p.length(); i++){
            while(tArr[i].length() < p.length()){
                tArr[i] += tArr[i+n];
                n++;
            }
            n=1;
            if(Long.parseLong(tArr[i]) <= Long.parseLong(p))
                answer++; 
        }
        return answer;
    }
}

// t에 있는 문자열 정수를 p의 문자열 정수 자릿수만큼 잘라서 값을 비교하여 도출
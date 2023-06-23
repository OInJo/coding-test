import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>();
        for(int n=0; n<name.length; n++){
            map.put(name[n],yearning[n]);
        }
        for(int i=0; i<photo.length; i++){
            for(String j : photo[i]){
                if(map.containsKey(j))
                    answer[i] += map.get(j);
            }
        }
        return answer;
    }
}
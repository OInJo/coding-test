class Solution {
    public String solution(int[] food) {
        String answer ="";
        StringBuilder person= new StringBuilder();
        for (int i = 1; i < food.length; i++)
            person.append(String.valueOf(i).repeat(food[i]/2));
        return person.toString() + '0' + person.reverse();
    }
}
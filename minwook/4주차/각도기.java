class Solution {
    public int solution(int angle) {
        return angle <= 90 ? (angle == 90 ? 2 : 1) : (angle < 180 ? 3 : 4); // 순서대로 예각, 직각, 둔각, 평각
    }
}
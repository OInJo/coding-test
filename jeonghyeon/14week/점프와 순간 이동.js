function solution(n)
{
    var ans = 0;
    while(n > 0) {
        if(n % 2 == 0) {
            n /= 2; // 거리가 짝수면 순간이동으로 거리 반으로 줄임
        } else {
            ans++;
            n--; // 홀수이면 한칸씩 가면서 건전기 사용량 증가
        }
    }
    return ans;
}
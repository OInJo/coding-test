function solution(n) {
    for(let i = 1; i < n; i++) { // 1부터 n까지의 수를 늘려가며 찾는다
        if(n % i == 1) { // n이 i로 나눠져서 나머지가 1이 되면 i 리턴
            return i;
        }
    }
}
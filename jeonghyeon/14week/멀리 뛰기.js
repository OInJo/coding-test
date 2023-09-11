function solution(n) {
    let fi = [1,1];
    for(let i = 2; i <= n; i++) {
        fi[i] = (fi[i-1] + fi[i-2]) % 1234567;
    }
    return fi[n];
}
// 1칸을 뛰는 방법 = 1 (1)
// 2칸을 뛰는 방법 = 2 (1,1) (2)
// n+2칸 = n+1칸 + n칸
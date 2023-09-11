function solution(A,B){
    var answer = 0;
    A = A.sort((a,b) => a-b); // 오름차순
    B = B.sort((a,b) => b-a); // 내림차순
    
    for(let i = 0; i < A.length; i++) {
        answer += A[i] * B[i];
    }

    return answer;
}
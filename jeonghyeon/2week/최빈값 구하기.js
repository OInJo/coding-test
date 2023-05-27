function solution(array) {
    const freq = []; // array 각 요소의 빈도수 저장 배열
    let maxfreq = 0; // 최대 빈도수
    let freqValue = -1; // 최빈값
    
    // 빈도수 알아보기
    for(let n of array) {
        if(freq[n]) {
            freq[n]++; // 배열에 요소가 있다면 빈도수 증가
        } else {
            freq[n] = 1; // 요소가 없다면 1로 저장
        }
        
        // 최빈값이 한 개
        if(freq[n] > maxfreq) {
            maxfreq = freq[n];
            freqValue = n; // 최빈값 저장
        }

        // 최빈값이 여러 개면 -1 리턴
        else if(freq[n] == maxfreq) {
            freqValue = -1;
        }  
    }
    return freqValue;
}
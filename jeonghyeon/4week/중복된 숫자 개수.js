function solution(array, n) {
    return array.filter(x => n === x).length;
    // 배열에서 n과 같은 숫자의 요소를 뽑아서 배열 생성 후 그 배열의 길이 리턴 
}
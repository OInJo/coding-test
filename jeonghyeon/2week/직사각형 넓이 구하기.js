function solution(dots) {
    // map() : 주어진 함수를 호출해 새로운 배열 생성
    const x = dots.map(([x, _]) => x); // dots 배열의 요소들의 첫 번째 값 뽑아 x 배열에 저장
    const y = dots.map(([_, y]) => y); // dots 배열의 요소들의 두 번째 값 뽑아 y 배열에 저장
    // 사용하지 않는 값들은 _ 로 표시

    return (Math.max(...x)- Math.min(...x)) * (Math.max(...y)- Math.min(...y)); 
    // 각 x, y좌표들의 최댓값과 최솟값을 구해 가로, 세로 길이 구한 후 곱해서 넓이 구하기
}
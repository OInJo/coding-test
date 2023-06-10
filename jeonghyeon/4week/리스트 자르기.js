function solution(n, slicer, num_list) {
    if(n === 1) { 
        // num_list의 0번 인덱스부터 b번 인덱스까지 잘라내기
        return num_list.slice(0, slicer[1] + 1);
    } else if(n === 2) {
        // num_list의 a번 인덱스부터 마지막 인덱스까지 잘라서 리턴
        return num_list.slice(slicer[0], num_list.length);
    } else if(n === 3) {
        // num_list의 a번 인덱스부터 b번 인덱스까지 잘라내기
        return num_list.slice(slicer[0], slicer[1] + 1);
    } else if(n === 4) {
        // num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로 잘라내기
        const result = [];
        // 슬라이스 된 요소를 담을 배열
        for(let i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
            result.push(num_list[i])
            // slicer[0]부터 slicer[1]까지 slicer[2] 간격으로 반복하면서 해당 요소를 result 배열에 push
        }
        return result;
    }
}
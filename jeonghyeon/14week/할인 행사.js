function solution(want, number, discount) {
    var answer = 0;
    for (let i = 0; i < discount.length - 9; i++) {
        let tenItems = discount.slice(i, i + 10); // 10개의 할인 제품

        let matches = true; // 할인 제품에 해당
        for (let j = 0; j < want.length; j++) {
        // 할인 제품에서 원하는 상품의 개수가 있나 확인
            const count = tenItems.filter(a => a === want[j]).length;
            if(count !== number[j]) {
                matches = false;
                break; // 개수가 다르면 그만 반복
            }
        }
        if(matches === true) answer++; // 같으면 날짜 추가
    }
    return answer;
}
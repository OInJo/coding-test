function solution(phone_book) {
    var answer = true;
    phone_book.sort(); // 오름차순
    for(let i = 0; i < phone_book.length - 1; i++) {
        if(phone_book[i+1].indexOf(phone_book[i]) === 0) { // 시작하는 부분에 있는지 살펴봄
            return false;
        }
    }
    return answer;
}
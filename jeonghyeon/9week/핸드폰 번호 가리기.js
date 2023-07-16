function solution(phone_number) {
    var star = '*'.repeat(phone_number.length - 4); // 4자리 제외 수 *
    var four = phone_number.slice(-4); // 뒷 4자리 따로 자르기
    return star + four;
}
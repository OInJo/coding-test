function solution(a, b) {
    const day = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']; // 시작이 금요일
    const monthday = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]; // 각 월의 마지막 날
    var days = 0; // 지난 날
    for(let i = 1; i < a; i++) { // 입력 월 이전의 달까지
        days += monthday[i - 1]; // 몇 일 지나왔는지 알아봄 (a가 5일 때 1~4달까지의 일 수 : 인덱스 3까지 더함 31+29+31+30)
    }
    days += b - 1; // 입력 일 수 더하고 1 뺀 인덱스 위치
    return day[days % 7]; // 요일로 리턴
}
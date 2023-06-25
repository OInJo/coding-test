function solution(a, b) {
    var answer = '';
    const dayweek = ["FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"];
    const day = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    let days = 0;
    for (let i = 0; i < a - 1; i++){
        days += day[i];
    }
    days += b - 1;
    answer = dayweek[days % 7];
    return answer;
}
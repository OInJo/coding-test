function solution(name, yearning, photo) {
    const answer = []; // 각 사진 추억 점수 담을 배열
    for(let i = 0; i < photo.length; i++) { // 사진에 있는 사람 전부 반복
        let score = 0; // 현재 사진 추억 점수
        for(let j = 0; j < photo[i].length; j++) { // 현재 사진 하나의 인물 반복
            for(let k = 0; k < name.length; k++) { // 그리움 점수가 있는 사람인지 찾음
                if(name[k] === photo[i][j]) { // 현재 인물이 그리움 점수가 있는지 확인
                    score += yearning[k]; // yearning배열에 있는 점수를 추억 점수에 더함
                }
            }
        }
        answer.push(score); // 현재 사진 추억 점수 배열에 추가
    }
    return answer;
}
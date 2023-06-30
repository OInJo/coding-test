function solution(s) {
    var answer = '';
    let word = s.split(' ');
    for (let i = 0; i < word.length; i++){
        let words = word[i];
        for (let a = 0; a < words.length; a++){
        if (a % 2 == 0) { // 짝수인경우
            answer += words[a].toUpperCase();
        }else{ // 홀수인경우
            answer += words[a].toLowerCase();
        }
    }
        if (i !== word.length - 1){
            answer += ' '; // 단어 사이의 공백
        }
    }
    return answer;
}
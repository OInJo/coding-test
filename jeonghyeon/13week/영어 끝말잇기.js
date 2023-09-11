function solution(n, words) {
    for(let i = 1; i < words.length; i++) {
        let word = words[i];
        if(words.indexOf(word) !== i) { // 이미 있는 단어
            return [i % n + 1, Math.floor(i / n) + 1];
        }
        // 알파벳이 이어지지 않음
        const lastword = words[i - 1].slice(-1);
        const firstword = word.slice(0, 1);
        if(lastword !== firstword) {
            return [i % n + 1, Math.floor(i / n) + 1];
        }
    }
    return [0,0];
}
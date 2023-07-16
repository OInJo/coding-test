process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    const a = Number(n[0]), b = Number(n[1]); // a : 한줄에 별 개수, b : 줄 수
    let star = '';
    for(let i = 0; i < b; i++) { // 줄 수 반복
        for(let j = 0; j < a; j++) { // 한 줄에 나올 *
            star += '*';
        }
        star += '\n'; // 한 줄 끝나면 줄 바꿈
    }
    console.log(star);
});
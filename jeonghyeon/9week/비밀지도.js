function solution(n, arr1, arr2) {
    var answer = [];
    for(let i = 0; i < n; i++) {
        let map1 = arr1[i].toString(2).padStart(n, "0"); // 2진수로 바꾸기
        let map2 = arr2[i].toString(2).padStart(n, "0");
        
        let code = '';
        for(let j = 0; j < n; j++) {
            if(map1[j] === "1" || map2[j] === "1") { // 1이 하나라도 있으면 
                code += "#"; // # 넣기
            } else {
                code += " "; // 없으면 공백
            }
        }
        answer.push(code);
    }
    return answer;
}
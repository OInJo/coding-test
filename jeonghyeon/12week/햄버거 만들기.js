function solution(ingredient) {
    var hamburger = 0;
    for(let i = 3; i < ingredient.length; i++) {
        if(ingredient[i-3] == 1 && ingredient[i-2] == 2 && ingredient[i-1] == 3 && ingredient[i] == 1) {
            ingredient.splice(i-3, 4); // 1231 잘라냄
            hamburger++; // 햄버거 추가
            i -= 3;
        }
    }
    return hamburger;
}

// 1 2 3 1 
function solution(price, money, count) {
    let totalcost = 0;
    for (let i = 1; i <= count; i++){
        totalcost += price * i;
    }
    let shortage = totalcost - money; // 모자란 긍액
    if (shortage > 0){ // 모자른 금액
        return shortage;
    }else{ // 모자르지 않은 금액
        return 0;
    }
}
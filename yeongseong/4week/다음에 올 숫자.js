function solution(common) {
    var answer = 0;
        // 등차수열인지 등비수열인지 확인하여 다음 숫자를 계산
        if((common[1] - common[0]) === (common[2]-common[1])){
            // 등차수열일 경우
            answer = common[common.length-1] + common[1] - common[0];
        }else{
            // 등비수열일 경우
            answer = common[common.length-1] * common[1]/common[0];
        }        
        return answer;
   }
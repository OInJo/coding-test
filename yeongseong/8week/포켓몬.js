function solution(nums) {
    const dedupe = new Set(nums);
    const dedupecount = dedupe.size;
    const numcount = nums.length;
    
    if (numcount / 2 > dedupecount){
        return dedupecount;
    } else {
        return numcount / 2;
    }
}
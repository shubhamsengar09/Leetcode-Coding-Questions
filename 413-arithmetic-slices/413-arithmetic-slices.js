/**
 * @param {number[]} nums
 * @return {number}
 */
var numberOfArithmeticSlices = function(nums) {
    const n = nums.length;
    const ap = new Array(n+1);
    ap[0] = 0;
    ap[1] = 0;
    var ans = 0;
    for(let i=2;i<n;i++){
         if((nums[i]-nums[i-1]) === (nums[i-1]-nums[i-2])) ap[i] = 1 + ap[i-1];
        else ap[i] = 0;
        ans += ap[i];
    }
    
    return ans;
    
};
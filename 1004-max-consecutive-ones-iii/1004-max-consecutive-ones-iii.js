/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var longestOnes = function(nums, k) {
        var s = 0;
        var z =0;
        var i;
        for(i =0;i<nums.length;i++){
            if(nums[i]==0) z++;
            if(z>k && nums[s++]==0) z--;
        }
        return i-s;
};
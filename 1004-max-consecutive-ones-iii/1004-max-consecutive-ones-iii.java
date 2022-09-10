class Solution {
    public int longestOnes(int[] nums, int k) {
        int s = 0;
        int z =0;
        int i;
        for(i =0;i<nums.length;i++){
            if(nums[i]==0) z++;
            if(z>k && nums[s++]==0) z--;
        }
        return i-s;
    }
}
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n  =nums.length;
        int max = nums[0];
        int min = nums[n-1];
        int e = 0;
        int s = 1;
        for(int i = 0,j = n-1;i<n;i++,j--){
            if(nums[i]<max) e = i;
            if(nums[j]>min) s = j;
            
            max = Math.max(max, nums[i]);
            min = Math.min(min,nums[j]);
        }
        return e -s+1 ;
    }
}
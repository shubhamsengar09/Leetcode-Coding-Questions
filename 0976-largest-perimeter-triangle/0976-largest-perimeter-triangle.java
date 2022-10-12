class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=2; i--){
            if(nums[i-2] + nums[i-1] > nums[i]){
                int sum = nums[i-2] + nums[i-1] + nums[i];
                return sum;
            }
        }
        
        return 0;
    }
}
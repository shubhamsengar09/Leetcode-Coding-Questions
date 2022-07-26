class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int[] ap = new int[n+1];
        int ans = 0;
       for(int i=2;i<n;i++){
            if((nums[i]-nums[i-1]) == (nums[i-1]-nums[i-2])) ap[i] = 1 + ap[i-1];
            else ap[i] =0;
            ans += ap[i];
       }
    return ans;
    }
}
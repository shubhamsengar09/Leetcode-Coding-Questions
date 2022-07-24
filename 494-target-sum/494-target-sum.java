class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i=0;i<nums.length;i++) 
            sum += nums[i];
        if(((sum - target) % 2 == 1) || (target > sum))
            return 0;
        int s1 = (sum-target)/2;
        return subsetsum(nums,s1);
    }
    int subsetsum(int[] nums,int s1){
        int n = nums.length;
        int[][] ap = new int[n+1][s1+1];
        ap[0][0] = 1;  
        for(int i =1;i<n+1;i++){
            for(int j =0;j<s1+1;j++){
                if(nums[i-1]<=j) ap[i][j] = ap[i-1][j-nums[i-1]] + ap[i-1][j];
                else  ap[i][j] = ap[i-1][j];
            }
        }
        return ap[n][s1];
    }
}
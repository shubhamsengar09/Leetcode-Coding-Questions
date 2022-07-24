class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
        }
        if(sum%2 != 0) return false ;
        else return subsetsum(nums,sum/2);  
    }
    boolean subsetsum(int[] nums, int  sum){
        int n = nums.length;
        boolean[][] ap = new boolean[n+1][sum+1];
        for(int i =0;i<n+1;i++){
            for(int j =0;j<sum+1;j++){
                if(i==0) ap[i][j] = false;
                if(j==0) ap[i][j] = true;
            }
        }
        for(int i =1;i<n+1;i++){
            for(int j =1;j<sum+1;j++){
                if(nums[i-1]<=j) ap[i][j] = ap[i-1][j-nums[i-1]] || ap[i-1][j];
                else ap[i][j] = ap[i-1][j];
            }
        }
        return ap[n][sum];
    }
}
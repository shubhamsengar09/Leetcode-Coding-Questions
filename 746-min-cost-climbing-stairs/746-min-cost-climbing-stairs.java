class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int [] ap = new int[n];
        ap[0] = cost[0];
        ap[1] = cost[1];
        for(int i =2;i<n;i++) 
            ap[i] = cost[i] + Math.min(ap[i-1], ap[i-2]);
        return Math.min(ap[n-1], ap[n-2]);
    }
}
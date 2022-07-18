class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int[] res = new int[n];
        int pf []= new int[n];
        for(int i =1;i<n;i++){
            pf[i] = pf[i-1] + nums[i-1];
            sum += nums[i];
        }
        for(int i=0;i<n;i++){
            int rest = sum-pf[i]-nums[i];
            res[i] = (i*nums[i]-pf[i])  + (rest-(n-1-i)*nums[i]);
        }
        return res;
        
    }
}
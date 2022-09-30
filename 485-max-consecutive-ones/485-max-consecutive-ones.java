class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n =0;
        int curr = 0;
        for(int i : nums){
            if(i==1){
                curr++;
                n = Math.max(curr,n);
            }else
                curr = 0;
        }
        return n;
    }
}
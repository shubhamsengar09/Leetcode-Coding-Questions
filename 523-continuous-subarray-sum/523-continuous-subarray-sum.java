class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer>mp = new HashMap<>();
        mp.put(0,-1);
        int currsum = 0;
        for(int i =0;i<nums.length;i++){
            currsum += nums[i];
            int rem = 0;
            if(k!=0) rem = currsum %k;
            if(mp.containsKey(rem)){
                if(i-mp.get(rem)>1) return true;
            }
            mp.putIfAbsent(rem, i); 
        }
        return false;
    }
}
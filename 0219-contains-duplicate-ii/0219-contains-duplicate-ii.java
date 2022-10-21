class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0) return false;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int j = nums[i];
            if(mp.containsKey(j) && i - mp.get(j)<= k) return true;
            mp.put(j,i);
        }
        return false;  
    }
}
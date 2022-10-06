class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], nums[i]);
        }
        int i= 0;
        for (i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return i;
    }
}
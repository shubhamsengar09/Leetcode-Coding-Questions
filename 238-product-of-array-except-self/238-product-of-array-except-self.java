class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] result = new int[nums.length];
       for (int i = 0, a = 1; i < nums.length; i++) {
           result[i] = a;
           a *= nums[i];
       } 
       
        for (int i = nums.length-1, a = 1; i >= 0; i--) {
           result[i] *= a;
           a *= nums[i];
    }
        return result;
    }
}
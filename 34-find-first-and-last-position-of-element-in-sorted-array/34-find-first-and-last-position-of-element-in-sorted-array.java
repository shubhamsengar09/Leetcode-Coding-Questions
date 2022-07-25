class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstOccurence(nums, target), lastOccurence(nums, target)};
        
    }
    static int firstOccurence(int[]nums, int target){
        int start = 0;
        int end = nums.length-1;
        int firstOccurrence = -1;
        
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(target==nums[mid]){
                firstOccurrence = mid;
                
                end = mid-1;
            }else if(target <nums[mid]){
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return firstOccurrence;
    }
    static int lastOccurence(int[]nums, int target){
        int start = 0;
        int end = nums.length-1;
        int lastOccurrence = -1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(target==nums[mid]){
                lastOccurrence = mid;
                
                start = mid+1;
            }else if(target<nums[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return lastOccurrence;
        
    }
}
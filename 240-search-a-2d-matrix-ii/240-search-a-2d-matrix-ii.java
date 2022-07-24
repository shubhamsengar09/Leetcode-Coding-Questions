class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i[]:matrix)
            if(Arrays.binarySearch(i,target)>=0)
                return true;
        return false;
    }
}
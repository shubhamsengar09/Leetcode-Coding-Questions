

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;

    }
    private void backtrack(List<List<Integer>> res, List<Integer>l , int [] nums, int start){
        res.add(new ArrayList<>(l));
        
        for(int i= start; i<nums.length; i++){
            l.add(nums[i]);
            backtrack(res,l,nums,i+1);
            l.remove(l.size()-1);
        }
    }
}

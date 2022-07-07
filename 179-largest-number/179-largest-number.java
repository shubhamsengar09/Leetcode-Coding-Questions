class Solution {
    public String largestNumber(int[] nums) {
       if(nums.length==0) return "";
        
        String [] words = new String[nums.length];
        for(int i =0;i<nums.length;i++){
            words[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(words,(x,y) -> (y+x).compareTo(x+y));
        StringBuilder res = new StringBuilder();
        if(words[0].equals("0")) return "0";
        for(int i =0;i<words.length;i++){
            res.append(words[i]);
        }
        return res.toString();
    }
}
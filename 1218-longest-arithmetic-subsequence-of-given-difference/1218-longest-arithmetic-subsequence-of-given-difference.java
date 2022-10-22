class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer>mp = new HashMap<>();
        int longe= 0;
        for(int i =0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i]-difference,0)+1);
            longe = Math.max(longe,mp.get(arr[i]));
        }
        return longe;
    }
}
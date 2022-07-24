class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] ap = new int[text1.length()][text2.length()];
        for(int[] each : ap)
            Arrays.fill(each, -1);
        
        return lcs(text1, text2, 0, 0, ap);
    }
    
    private int lcs(String s1, String s2, int n, int m, int[][] ap) {
        if(n == s1.length() || m == s2.length()) return 0;
        if(ap[n][m] != -1)return ap[n][m];
        int result;
        if(s1.charAt(n) == s2.charAt(m)) {
            result =  1 + lcs(s1, s2, n + 1, m + 1, ap);
        } else {
            result = Math.max(lcs(s1, s2, n, m + 1, ap), lcs(s1, s2, n + 1, m, ap));
        }
        ap[n][m] = result;
        return result;
    }
}
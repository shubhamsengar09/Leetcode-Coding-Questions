class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
         int n = text1.length();
        int m = text2.length();
        int[][] ap = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (text1.charAt(i -1) == text2.charAt(j - 1)) 
                    ap[i][j] = 1 + ap[i - 1][j - 1];
                else ap[i][j] = Math.max(ap[i - 1][j], ap[i][j - 1]);
            }
        }
        return ap[n][m];
    }
}
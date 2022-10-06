class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int dp [][] = new int[m+1][n+1];
        for(int i =0;i<=m;i++){
            for(int j =0;j<=n;j++){
                dp[i][j] = -1;
            }
        }
        return edit(word1, word2,dp);
    }
    public int edit(String word1, String word2, int dp[][]){
        int m = word1.length();
        int n = word2.length();
        if(dp[m][n] != -1) return dp[m][n];
        if(m==0) return dp[m][n] = n;
        if(n==0) return dp[m][n] = m;
        if(word1.charAt(0)==word2.charAt(0))
            return dp[m][n] = edit(word1.substring(1), word2.substring(1),dp);
        else{
            int insert = edit(word1, word2.substring(1),dp);
            int delete = edit(word1.substring(1), word2,dp);
            int replace = edit(word1.substring(1), word2.substring(1), dp);
            dp[m][n] = 1+ Math.min(insert, Math.min(delete, replace));
        }
        return dp[m][n];
    }
}
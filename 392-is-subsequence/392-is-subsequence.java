class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] ap = new int[m+1][n+1];
        for(int i =0;i<m+1;i++){
            for(int j =0;j<n+1;j++){
                if(i==0 || j==0) ap[i][j] = 0;
                else{
                    if(s.charAt(i-1) == t.charAt(j-1)) ap[i][j] = 1+ ap[i-1][j-1];
                    else ap[i][j] = Math.max(ap[i-1][j], ap[i][j-1]);
                }
            }
        }
        int ans = ap[m][n];
        if(m==ans) return true;
        else return false;
    }
}
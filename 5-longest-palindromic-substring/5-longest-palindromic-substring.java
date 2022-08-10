class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        boolean ap[][] = new boolean[n][n];
        for(int i =n-1;i>=0;i--){
            for(int j =i;j<n;j++){
                ap[i][j] = s.charAt(i) == s.charAt(j)&& (j - i < 3 || ap[i + 1][j - 1]);
                if(ap[i][j] && (res ==null || j-i+1>res.length()))
                    res = s.substring(i,j+1);
            }
        }
        return res;
    }
}
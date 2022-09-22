class Solution {
    Integer[][] ap;
    public int twoEggDrop(int n) {
        int a = 2;
        ap = new Integer[n + 1][a + 1];
        return ans(n, a);
    }

    private int ans(int n, int a){
        if(n == 0) return 0;
        if(a == 1) return n;
        if(ap[n][a] != null) return ap[n][a];
        int res = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++)
            res = Math.min(res, 1 + Math.max(ans(i - 1, a - 1), ans(n - i, a)));
        return ap[n][a] = res;
    }
}
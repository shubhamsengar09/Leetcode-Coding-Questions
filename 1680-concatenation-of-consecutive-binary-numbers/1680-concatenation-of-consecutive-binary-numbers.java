class Solution {
    public int concatenatedBinary(int n) {
        final long mod = (long) (1e9 + 7);
        long res = 0;
        int b = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) b++;
            res = ((res << b) + i) % mod;
        }
        return (int) res;
    }
}
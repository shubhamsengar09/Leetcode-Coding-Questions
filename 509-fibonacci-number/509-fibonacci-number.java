class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        int [] ap = new int[n+1];
        ap[0] = 0;
        ap[1] = 1;
        for(int i =2;i<=n;i++) ap[i] = ap[i-1] + ap[i-2];
        return ap[n];
    }
}
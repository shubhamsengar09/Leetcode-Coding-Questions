class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] ap=new int[n+1];
        int sum=0;
        for(int i=n;i>=0;i--){
            int len=0;
            int val=0;
            int max=0;
            for(int j=i;j<Math.min(n,i+k);j++){
                len++;
                val=Math.max(val,arr[j]);
                sum=len*val+ap[j+1];
                max=Math.max(sum,max);
            }
            ap[i]=max;
        }
        return ap[0];
    }
}
class Solution {
    int count;
    public int countArrangement(int n) {
        
        int[]box=new int[n];
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=i+1;
        permute(arr,box,1,n);
        return count;
    }
    public void permute(int[]arr, int[]box, int cb, int tb){
        if(cb>tb){
            count++;
            return;
        }
        for(int i=0;i<box.length;i++){
            if(box[i]==0){
                if(cb%(i+1)!=0 && (i+1)%cb!=0){
                    continue;
                }
                box[i]=cb;
                permute(arr,box,cb+1,tb);
                box[i]=0;
            }
        }
    }
}
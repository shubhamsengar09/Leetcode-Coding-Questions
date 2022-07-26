class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] ap = new int[366];
        int j=0;
        for(int i=1;i<366;i++){
            if(j==n) break;
            if(days[j] != i) ap[i] = ap[i-1];
            else{
                int one = ap[i-1] + costs[0];
                int seven = ap[Math.max(0,i-7)] + costs[1];
                int thirty = ap[Math.max(0,i-30)] + costs[2];
                ap[i] = Math.min(one, Math.min(seven, thirty));
                j++;
            }
        }
        return ap[days[n-1]];
        
    }
}
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, ArrayList<Integer>> mp1 = new HashMap<>();
        for(int i =0;i<n;i++){
            String row = " ";
            for(int j =0;j<n;j++){
                row += grid[i][j];
                row += ",";
            }
           if(mp1.containsKey(row)){
               ArrayList<Integer> val = mp1.get(row);
               val.set(0,val.get(0)+1);
               mp1.replace(row,val);
           }else{
               mp1.put(row,new ArrayList<>());
               mp1.get(row).add(1);
               mp1.get(row).add(0);
               
           }      
        
        }
        for(int j =0;j<n;j++){
            String row = " ";
            for(int i =0;i<n;i++){
                row += grid[i][j];
                row += ",";
            }
           if(mp1.containsKey(row)){
               ArrayList<Integer> val = mp1.get(row);
                val.set(1,val.get(1)+1);
               mp1.replace(row,val);
           }else{
               mp1.put(row,new ArrayList<>());
               mp1.get(row).add(0);
               mp1.get(row).add(1);
               
           }      
        
        }
      
        int ans = 0;
        for(Map.Entry<String,ArrayList<Integer>> m: mp1.entrySet()){
                int a = m.getValue().get(0);
                int b = m.getValue().get(1);
                ans += (a*b);
            
        }
        return ans;
        
    }
}
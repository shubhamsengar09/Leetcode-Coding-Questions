class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> mp1 = new HashMap<>();
        Map<String, Integer> mp2 = new HashMap<>();
        for(int i =0;i<n;i++){
            String row = " ";
            for(int j =0;j<n;j++){
                row += grid[i][j];
                row += ",";
            }
            mp1.put(row,mp1.getOrDefault(row,0) +1);
        }
        for(int j =0;j<n;j++){
            String col = " ";
            for(int i =0;i<n;i++){
                col += grid[i][j];
                col += ",";
            }
            mp2.put(col,mp2.getOrDefault(col,0) +1);
        }
        int ans = 0;
        for(Map.Entry<String,Integer> m: mp1.entrySet()){
            if(mp2.containsKey(m.getKey())){
                int a = m.getValue();
                int b = mp2.get(m.getKey());
                ans += (a*b);
            }
        }
        return ans;
        
    }
}
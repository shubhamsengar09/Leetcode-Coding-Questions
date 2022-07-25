class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int [][] ap = new int[numRows][numRows];
        ap[0][0] =1;
         for(int i =0;i<numRows;i++){
             ap[i][0] = 1;
             ap[i][i] = 1;
             for(int j=1;j<i;j++){
                 ap[i][j] = ap[i-1][j-1] + ap[i-1][j];
             }
         }
        for(int i =0;i<numRows;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                list.add(ap[i][j]);
            }
            ans.add(list);
        }
        return ans;
     }
}
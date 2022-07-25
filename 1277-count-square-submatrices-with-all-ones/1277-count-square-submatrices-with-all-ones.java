class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ap = new int[m+1][n+1];
        int sum = 0;
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0) ap[i][j] = matrix[i][j];
                else if(matrix[i][j]==1){
                    if(ap[i-1][j-1]>=1 && ap[i-1][j]>=1 && ap[i][j-1]>=1)
                        ap[i][j]  = 1+ Math.min(ap[i-1][j-1], Math.min(ap[i][j-1],ap[i-1][j]));
                    else
                        ap[i][j] =1;
                }
                 sum += ap[i][j];
            }
           
        }
        return sum;
    }
}
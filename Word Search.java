class Solution {
    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for(int i =0; i<board.length;i++){
            for(int j = 0; j<board[0].length;j++){
                if(board[i][j]==word.charAt(0) && backtrack(board,i,j,0,word))
                    return true;
                
            }
        }
        return false;
    }
    private boolean backtrack(char[][] board, int i, int j ,int  count , String word){
        if(count==word.length())
            return true;
        if(i==-1 || i>=board.length || j==-1 || j>= board[0].length || board[i][j] != word.charAt(count) || visited[i][j])
            return false;
        
        visited [i][j] = true;
        if(backtrack(board, i+1, j, count +1, word)||
                      backtrack(board, i-1, j, count +1, word)||
                      backtrack(board, i,j+1, count +1, word)||
                      backtrack(board, i, j-1, count +1, word)){
            return true;
        }
            
        visited[i][j] = false;
        return false;
    }
    
}

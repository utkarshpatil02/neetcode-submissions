class Solution {
    
    public static boolean isSafe(char[][] board,int row,int col,char ch){
        //colums
        for(int i=0;i<9;i++){
            if(board[i][col]==ch){
                return false;
            }
        }

        //rows
        for(int j=0;j<9;j++){
            if(board[row][j]==ch){
                return false;
            }
        }

        //grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==ch){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] != '.') {
                    char ch = board[row][col];
                    // Temporarily remove the current digit
                    board[row][col] = '.';
                    if (!isSafe(board, row, col, ch)) {
                        return false;
                    }
                    // Put it back
                    board[row][col] = ch;
                }
            }
        }

        return true;
    }
}

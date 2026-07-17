class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length&&col>=0){
            if(matrix[row][col]==target){
                return true;
            }else if(target>matrix[row][col]){
                row++;  //move bottom
            }else{
                col--;  //move left
            }
        }
        return false;
    }
}
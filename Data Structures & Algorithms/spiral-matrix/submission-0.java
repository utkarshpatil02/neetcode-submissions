class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int startRow=0;
        int startCol=0;
        int endRow=n-1;
        int endCol=m-1;
        List<Integer> arr = new ArrayList<>();
        while(startRow<=endRow&&startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
               arr.add(matrix[startRow][j]);
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                arr.add(matrix[i][endCol]);
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                arr.add(matrix[endRow][j]);
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                arr.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return arr;
    }
}

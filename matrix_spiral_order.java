/*
85. Given an m x n matrix, return all elements of the matrix in spiral order. 
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]] 
Output: [1,2,3,6,9,8,7,4,5] 
*/
class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int top=0,bottom=matrix.length-1;
        int left=0,right=matrix[0].length-1;

        while(top<=bottom && left<=right) {
            for (int j=left;j<=right; j++) {
                System.out.print(matrix[top][j]+" ");
            }
            top++;
            for (int i=top;i<=bottom; i++) {
                System.out.print(matrix[i][right]+" ");
            }
            right--;
            for (int j=right;j>=left;j--) {
                System.out.print(matrix[bottom][j]+" ");
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                System.out.print(matrix[i][left] + " ");
            }
            left++;
        }
    }
}

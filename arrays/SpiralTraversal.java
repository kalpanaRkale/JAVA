public class SpiralTraversal {

    // Method to print the matrix in spiral order
    public static void spiral(int mat[][]) {
        int sr = 0, sc = 0;
        int er = mat.length - 1, ec = mat[0].length - 1;

        while (sr <= er && sc <= ec) {
            // Print top border
            for (int j = sc; j <= ec; j++) {
                System.out.print(mat[sr][j] + " ");
            }
            // Print right border
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(mat[i][ec] + " ");
            }
            // Print bottom border
            for (int j = ec - 1; j >= sc; j--) {
                if (sr == er) {
                    break;
                }
                System.out.print(mat[er][j] + " ");
            }
            // Print left border
            for (int i = er - 1; i > sr; i--) {
                if (sc == ec) {
                    break;
                }
                System.out.print(mat[i][sc] + " ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        spiral(matrix);
    }
}
//Time Complexity: 𝑂(𝑚×𝑛) 
//SpSpace Complexity: 𝑂(1)

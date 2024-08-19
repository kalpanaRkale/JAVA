public class DiagonalSum {

    // Method to calculate the sum of the primary and secondary diagonals of a matrix
    public static int diagonalSum(int mat[][]) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) { // Time complexity = O(n)
            sum += mat[i][i]; // Primary diagonal
            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - i - 1]; // Secondary diagonal
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(diagonalSum(matrix));
    }
}

//        for(int i=0;i< mat.length;i++){// Time complexity = O(n^2)
//            for(int j = 0; j < mat[0].length; j++){
//                if(i==j){
//                    sum+=mat[i][j];//primary diagonal sum
//                }
//                else if(i+j==mat.length-1){
//                    sum+=mat[i][j];//secondary diagonal sum
//                }
//            }
//        }

// Space Complexity - O(1)

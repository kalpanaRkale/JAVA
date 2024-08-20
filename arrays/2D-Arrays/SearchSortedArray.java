public class SearchSortedArray {
    //search in a array which is given row-wise and column-wise sorted
    //Brute Force Time Complexity - O(n^2)
    //Row-wise Binary search Time Complexity - O(nlogn)
    //Staircase Search Time Complexity - O(n+m)
    //if (n>>m):TC=O(n) and if m>>n:TC=O(m)

    public static boolean search(int mat[][],int key){
        int row=0, col=mat[0].length-1;

        while(row<mat.length && col>=0){
            if(mat[row][col]==key){
                System.out.println("Element found at ("+row+","+col+")");
                return true;
            }
            else if(key<mat[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Element not found in the array");
        return false;

    }

    public static void main(String[] args) {
            int matrix[][]= {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
            System.out.println(search(matrix,15));
    }
}
//Staircase Search is used because it provides a linear time solution to find an element in a matrix that is sorted both row-wise and column-wise, making it significantly more efficient than a brute-force search.
//Time Complexity: Staircase Search - O(n+m), where 𝑛 is the number of rows and 𝑚 is the number of columns. If 𝑛≫𝑚:𝑂(𝑛) and if 𝑚≫𝑛: 𝑂(𝑚)
//Space Complexity: 𝑂(1) 

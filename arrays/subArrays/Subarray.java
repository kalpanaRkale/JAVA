public class Subarray {

    public static void printSubArrays(int[] numbers) {
        // Brute force approach: Print all sub-arrays
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + (k < j ? ", " : ""));
                }
                total++;
                System.out.print("] ");
            }
            System.out.println();
        }

        System.out.println("\nTotal number of sub-arrays = " + total);
    }

    public static void main(String[] args) {
        int[] arr = {3, -4, 8, 10, 16};
        int[] arr1 = {4, -2, -7, 8, 10, 1, -4};

        printSubArrays(arr);
        printSubArrays(arr1);
    }
}
//Time Complexity - O(n^3)
//Space Complexity - O(1)

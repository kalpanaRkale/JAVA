public class ArrayReversal {

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] numbers) {
        System.out.println("\nReversed array - ");
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 8, 10, 16, 24, 7, 88, 53};

        System.out.println("Original array - ");
        printArray(arr);  // Print original array
        reverse(arr);     // Reverse the array
        printArray(arr);  // Print reversed array
    }
}
//Time complexity - O(n)
//Space complexity - O(1)

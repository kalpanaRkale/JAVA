public class MinMaxinArray {

    public static int findMinMax(int[] numbers) {
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible value
        int min = Integer.MAX_VALUE; // Initialize min to the largest possible value

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Largest number in the array - " + max);
        System.out.println("Smallest number in the array - " + min);

        return max; // Returning max or min is optional based on the requirement
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 8, 10, 16, 24, 7, 88, 53};
        findMinMax(arr);
    }
}
//Time Complexity - O(n)
//Space Complexity - O(1)

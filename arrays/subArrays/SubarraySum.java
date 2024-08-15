public class SubarraySum {

    // Method to calculate the maximum and minimum sum of subarrays using a prefix sum array
    public static void prefixSumArray(int numbers[]) {
        int maxSumArray = Integer.MIN_VALUE;
        int minSumArray = Integer.MAX_VALUE;
        int prefixArr[] = new int[numbers.length];

        // Create prefix sum array
        prefixArr[0] = numbers[0];
        for (int i = 1; i < prefixArr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + numbers[i];
        }

        // Calculate max and min sum of subarrays
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sumArray = (i == 0) ? prefixArr[j] : prefixArr[j] - prefixArr[i - 1];

                if (maxSumArray < sumArray) {
                    maxSumArray = sumArray;
                }
                if (minSumArray > sumArray) {
                    minSumArray = sumArray;
                }
            }
        }

        System.out.println("\nSum of Sub-Arrays using Prefix Sum Array");
        System.out.println("Max sum of Subarray = " + maxSumArray);
        System.out.println("Min sum of Subarray = " + minSumArray);
    }

    public static void main(String[] args) {
        int arr1[] = {3, -4, 8, 10, 16};
        int arr2[] = {4, -2, -7, 8, 10, 1, -4};

        prefixSumArray(arr1);
        prefixSumArray(arr2);
    }
}
//Time Complexity: O(n^2) - Due to the nested loops iterating over the subarray ranges.
//Space Complexity: O(n) - For storing the prefix sum array.

import java.util.Scanner;

public class ArrayPairs {

    public static void printPairs(int[] numbers) {
        System.out.println("\nPairs in the Array:");
        int totalPairs = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs - " + totalPairs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printPairs(arr);
    }
}
//Time Complexity - O(n^2)
//Space Complexity - O(1)

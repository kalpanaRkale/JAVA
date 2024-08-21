public class LargestString {
    // Method to find the lexicographically largest string in an array of strings
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
//Time Complexity - O(n*m) , where 𝑛 is the number of strings in the array and 𝑚 is the average length of the strings
//Space Complexity - O(1)
